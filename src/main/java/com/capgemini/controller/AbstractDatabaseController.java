package com.capgemini.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by gerard on 8-5-17.
 */
public abstract class AbstractDatabaseController {

    protected Connection getConnection(String database) throws SQLException {
        String url = "jdbc:mysql://capgemini-academy.ck17qz3qdemp.eu-west-1.rds.amazonaws.com:8080/" + database;
        String username = database;
        String password = "capgemini";
        return DriverManager.getConnection(url, username, password);
    }

}
