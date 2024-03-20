package com.white.course2homework14.service;


import com.white.course2homework14.entitys.Employee;
import com.white.course2homework14.enums.Department;
import com.white.course2homework14.exceptions.ArrayIsFull;
import com.white.course2homework14.exceptions.EmployeeAlreadyAdded;
import com.white.course2homework14.exceptions.IncorrectEmployeeData;
import com.white.course2homework14.repository.EmployeeRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.apache.commons.lang3.StringUtils.capitalize;
import static org.apache.commons.lang3.StringUtils.isAlpha;


@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepositoryImpl repository;


    @Override
    public Employee add(String name, String surName, String patronymic, Department department, double salary) {
        if (!isAlpha(name) || !isAlpha(surName) || !isAlpha(patronymic)) throw new IncorrectEmployeeData();
        Employee employee = new Employee(capitalize(name), capitalize(surName), capitalize(patronymic), department, salary);
        if (!repository.isNotFullDb()) throw new ArrayIsFull();
        if (repository.contains(employee)) throw new EmployeeAlreadyAdded();
        repository.add(employee);
        return employee;
    }

    @Override
    public void deleteById(Long id) {
        Employee employee = findById(id);
        repository.delete(employee);
    }

    @Override
    public Employee findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }
}
