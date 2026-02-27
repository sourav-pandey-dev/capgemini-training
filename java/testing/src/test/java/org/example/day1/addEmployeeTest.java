package org.example.day1;

import org.junit.jupiter.api.Test;
import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class AddEmployeeTest {

    @Test
    void testAddEmployee() {

        EmployeeDao dao = new EmployeeDao();

        try {
            Date hireDate = Date.valueOf("2000-05-12");
            Double salary = 58200.0;
            int employee_id = 208;
            Integer manager_id = 200;
            Integer department_id = null;
            String phone_number = "63526374";
            String first_name = "Aditya";
            String last_name = "Sharma";
            String email = "adi@gmail.com";
            String job_title = null;

            Employee emp = new Employee(hireDate,salary,employee_id,manager_id,department_id,phone_number,first_name,last_name,email,job_title);

            System.out.println(emp);
            Employee employee = dao.addEmployee(emp);

            assertNotNull(employee);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}