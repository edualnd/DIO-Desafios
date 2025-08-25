package com.board.service;

import com.board.persistence.dao.BoardColumnDAO;
import com.board.persistence.dao.BoardDAO;
import com.board.persistence.entity.BoardEntity;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class BoardQueryService {
    private final Connection connection;

    public Optional<BoardEntity> findById(final Long id) throws SQLException {
        var dao = new BoardDAO(connection);
        var boardColumnDAO = new BoardColumnDAO(connection);
        try {
            var optional = dao.findById(id);
            if (optional.isPresent()){
                var entity = optional.get();
                entity.setBoardColumns(boardColumnDAO.findByBoardId(entity.getId()));
                return  Optional.of(entity);
            }
            connection.commit();
            return Optional.empty();
        } catch (SQLException e){
            connection.rollback();
            throw e;
        }
    }
    public boolean exists(final Long id) throws SQLException {
    return false;
   }
}
