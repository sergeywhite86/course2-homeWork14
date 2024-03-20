package com.white.course2homework14.service;

import com.white.course2homework14.entitys.Employee;
import com.white.course2homework14.enums.Department;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee empWithMaxSalaryByDepartment(int departmentNumber);

    Employee empWithMinSalaryByDepartment(int departmentNumber);

    List<Employee> findAllByDepartment(int departmentNumber);

    Map<Department, List<Employee>> findEmployeesByDepartment();
}

