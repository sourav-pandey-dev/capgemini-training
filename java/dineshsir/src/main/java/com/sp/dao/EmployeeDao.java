package com.sp.dao;

import java.sql.*;

public class EmployeeDao {

    public void printAllEmployees() throws SQLException {
        try (Connection connection = DBConnection.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee");

            while (resultSet.next() == true) {
                int empId = resultSet.getInt(1);
                String stringEmpId = resultSet.getString(1);
                int empId2 = resultSet.getInt("employee_id");
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString("last_name");

                System.out.println(empId + "\t" + firstName + " " + lastName);
            }
        } finally {
            System.out.println("done");
        }
    }
    Employee getEmployee(int employeeId) throws SQLException{
        Employee emp = new Employee();
        try (Connection connection = DBConnection.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee where employee_id = "+employeeId);

            if (resultSet.next() == true) {
                int empId = resultSet.getInt(1);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone_number");
                Date hireDate = resultSet.getDate("hire_date");
                String jobTitle = resultSet.getString("job_title");
                Object salary = resultSet.getObject("salary");
                Integer managerId = resultSet.getInt("manager_id");
                Integer depid = resultSet.getInt(("department_id"));

                emp.setLast_name(lastName);
                emp.setEmail(email);
                emp.setJob_title(jobTitle);
                emp.setHire_date(hireDate);
                emp.setDepartment_id(depid);
                emp.setPhone_number(phone);
                emp.setManager_id(managerId);
                emp.setFirst_name(firstName);
                emp.setSalary((Double) salary);
            }
        }
        finally {

        }
        return emp;
    }

    public static void main(String[] args) {
        EmployeeDao empd = new EmployeeDao();
        try {
            empd.printAllEmployees();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Employee es = empd.getEmployee(202);

            if (es != null) {
                System.out.println("Name: " + es.getFirst_name() + " " + es.getLast_name());
                System.out.println("Email: " + es.getEmail());
                System.out.println("Salary: " + es.getSalary());
            } else {
                System.out.println("Employee not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    Employee addEmployee(Employee emp) throws SQLException{
        try (Connection connection = DBConnection.getConnection()) {
            String sql = "insert into employee values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, emp.getEmployee_id());
            stmt.setString(2,emp.getFirst_name());
            stmt.setString(3,emp.getLast_name());
            stmt.setString(4,emp.getEmail());
            stmt.setString(5,emp.getPhone_number());
            stmt.setDate(6, (Date) emp.getHire_date());
            stmt.setString(7,emp.getJob_title());
            stmt.setObject(8,emp.getSalary());
            stmt.setObject(9,emp.getManager_id());
            stmt.setObject(10,emp.getDepartment_id());

            int rowUpdate = stmt.executeUpdate();
            if(rowUpdate != 1){
                throw new RuntimeException("some sql error occured");
            }
            else
                return emp;
        }


    }
    public boolean deleteEmployee(int emp_id) throws SQLException{
        try{Connection connection = DBConnection.getConnection();
            String sqlDel = "delete from employee where employee_id = ?";
            PreparedStatement stmt = connection.prepareStatement(sqlDel);
            stmt.setInt(1,emp_id);
            int rowUpdated = stmt.executeUpdate();
        if(rowUpdated !=1){
            throw new RuntimeException("some error occured");
        }
        else
            return true;
    }
    finally {

        }
    }
}