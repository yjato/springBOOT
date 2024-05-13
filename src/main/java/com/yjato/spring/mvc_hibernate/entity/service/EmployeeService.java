package com.yjato.spring.mvc_hibernate.entity.service;
import com.yjato.spring.mvc_hibernate.entity.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}