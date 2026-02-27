package org.example;

import java.util.Arrays;
import java.util.List;


public class salarysum {
    List<Department> departments = EmployeeRepository.getDepartments();
    List<Employee> employees = EmployeeRepository.getEmployees();
    public double salary(){
        double sum = employees.stream().mapToDouble(emp -> emp.getSalary()).sum();
        System.out.println(sum);
        return sum;
    }
    
}
