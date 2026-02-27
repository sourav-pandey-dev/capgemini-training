package org.example.day1;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

public class DBConnection {

    public static Connection getConnection() {

        MysqlDataSource ds = new MysqlDataSource();
        ds.setUser("root");
        ds.setPassword("11july2002");
        ds.setURL("jdbc:mysql://localhost:3306/company_db?allowPublicKeyRetrieval=true&useSSL=false");

        try {
            return ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}