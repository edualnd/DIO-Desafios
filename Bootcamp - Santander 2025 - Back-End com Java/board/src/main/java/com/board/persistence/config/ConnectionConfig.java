package com.board.persistence.config;

import static lombok.AccessLevel.PRIVATE;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor(access = PRIVATE)
public class ConnectionConfig {
    public static Connection getConnection() throws SQLException {
        var url = "jdbc:mysql://localhost:3306/board";
        var user = "duda";
        var password =  "sete77";
        var connection = DriverManager.getConnection(url,
                user, password);
        connection.setAutoCommit(false);
        return connection;
    }
}
