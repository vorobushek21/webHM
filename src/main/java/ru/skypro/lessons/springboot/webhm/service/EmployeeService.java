package ru.skypro.lessons.springboot.webhm.service;

import ru.skypro.lessons.springboot.webhm.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    Employee findEmployeeWithMaxSalary();
    Employee findEmployeeWithMinSalary();
    Integer salarySum();
    List<Employee> aboveAverageSalary();

}