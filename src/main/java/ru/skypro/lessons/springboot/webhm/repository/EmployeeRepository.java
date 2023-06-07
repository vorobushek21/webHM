package ru.skypro.lessons.springboot.webhm.repository;

import ru.skypro.lessons.springboot.webhm.pojo.Employee;

import java.util.List;

public interface EmployeeRepository {
    public List<Employee> getAllEmployees();
}
