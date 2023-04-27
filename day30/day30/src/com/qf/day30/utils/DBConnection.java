package com.qf.day30.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static final Properties PROPERTIES = new Properties();
    static {
        try {
            final InputStream inputStream = DBConnection.class.getResourceAsStream("/dbconfig.properties");
            PROPERTIES.load(inputStream);
            Class.forName(PROPERTIES.getProperty("jdbc.driver"));
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager
                .getConnection(PROPERTIES.getProperty("jdbc.url"),
                        PROPERTIES.getProperty("jdbc.user"), PROPERTIES.getProperty("jdbc.password"));
    }
}
