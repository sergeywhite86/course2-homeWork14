package com.white.course2homework14.controllers;

import com.white.course2homework14.entitys.Employee;
import com.white.course2homework14.enums.Department;
import com.white.course2homework14.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService service;

    @GetMapping("/max-salary")
    public Employee empWithMaxSalaryByDepartment(@RequestParam int departmentId) {
        return service.empWithMaxSalaryByDepartment(departmentId);
    }

    @GetMapping("min-salary")
    public Employee empWithMinSalaryByDepartment(@RequestParam int departmentId) {
        return service.empWithMinSalaryByDepartment(departmentId);
    }

    @GetMapping("/all")
    public List<Employee> findAllByDepartment(@RequestParam int departmentId) {
        return service.findAllByDepartment(departmentId);
    }

    @GetMapping("/all/sort")
    public Map<Department, List<Employee>> findEmployeesByDepartment() {
        return service.findEmployeesByDepartment();
    }
}
