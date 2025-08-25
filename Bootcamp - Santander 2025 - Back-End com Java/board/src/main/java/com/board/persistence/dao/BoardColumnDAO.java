package com.board.persistence.dao;

import com.board.persistence.entity.BoardColumnKindEnum;
import com.board.persistence.entity.BoardColumnsEntity;

import com.mysql.cj.jdbc.StatementImpl;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class BoardColumnDAO {
    private final Connection connection;

    public BoardColumnsEntity insert(final BoardColumnsEntity entity) throws SQLException {
        var sql = "INSERT INTO FROM BOARD_COLUMNS (name, `order`, kind, board) VALUES (?," +
                " ?, ?, ?);";
        try(var statement = connection.prepareStatement(sql)){
            statement.setString(1, entity.getName());
            statement.setInt(2, entity.getOrder());
            statement.setString(3, entity.getKind().name());
            statement.setLong(4, entity.getBoard().getId());
            statement.executeUpdate();
            var resultSet = statement.getResultSet();
            if (statement instanceof StatementImpl impl){
                entity.setId(impl.getLastInsertID());
            }
            return entity;
        }
    }
    public void delete(final Long id) throws SQLException {
        var sql = "DELETE FROM BOARD_COLUMNS WHERE id = ?;";
        try(var statement = connection.prepareStatement(sql)){
            statement.setLong(1, id);
            statement.executeUpdate();
        }
    }

    public boolean exists(final Long id) throws SQLException {
        var sql = "SELECT 1 FROM BOARD_COLUMNS WHERE id = ?;";
        try(var statement = connection.prepareStatement(sql)){
            statement.setLong(1, id);
            statement.executeQuery();
            return statement.getResultSet().next();
        }
    }

    public List<BoardColumnsEntity> findByBoardId(Long id) throws SQLException{
        List<BoardColumnsEntity> entities = new ArrayList<>();
        var sql = "SELECT * FROM BOARD_COLUMNS WHERE board_id = ? ORDER BY `order`;";
        try(var statement = connection.prepareStatement(sql)){
            statement.setLong(1, id);
            statement.executeQuery();
            var resultSet = statement.getResultSet();
            while(resultSet.next()){
                var entity = new BoardColumnsEntity();
                entity.setId(resultSet.getLong("id"));
                entity.setName(resultSet.getString("name"));
                entity.setOrder(resultSet.getInt("order"));
                entity.setKind(BoardColumnKindEnum.findByName(resultSet.getString("kind")));
                entities.add(entity);
            }

            return entities;
        }
    }
}
