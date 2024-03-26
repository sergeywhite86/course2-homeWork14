package com.white.course2homework14.repository;


import com.white.course2homework14.entitys.Employee;

import java.util.List;

public interface EmployeeRepository {

    Employee add(Employee employee);

    boolean delete(Employee employee);

    Employee findById(Long id);

    List<Employee> findAll();

    boolean contains(Employee employee);

}
