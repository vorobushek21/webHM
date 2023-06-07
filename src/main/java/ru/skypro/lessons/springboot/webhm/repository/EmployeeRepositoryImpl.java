package ru.skypro.lessons.springboot.webhm.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.webhm.pojo.Employee;
import ru.skypro.lessons.springboot.webhm.repository.EmployeeRepository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private final List<Employee> employeeList = List.of(
            new Employee("Rob", 90_000),
            new Employee("Joe", 60_000),
            new Employee("Alice", 25_000),
            new Employee("Daniel", 50_000));

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}