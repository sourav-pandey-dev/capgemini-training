package org.example.day1;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class DBConnectionTest {
    @Test
    public static void main(String[] args) {
        Connection conn = DBConnection.getConnection();
        if (conn != null) {
            System.out.println("Connected Successfully!");
        } else {
            System.out.println("Connection Failed.");
        }
    }
}