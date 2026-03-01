package org.example.day1;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class delEmployeeTest {
    @Test
    void delTest1() {
        try {
            EmployeeDao dao = new EmployeeDao();
            boolean result = dao.deleteEmployee(208);
            assertTrue(result);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}