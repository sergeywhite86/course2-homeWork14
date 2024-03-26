package com.white.course2homework14.repository;


import com.white.course2homework14.entitys.Employee;
import com.white.course2homework14.exceptions.EmployeeNotFound;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Getter
@RequiredArgsConstructor
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private final InMemoryDataBase dataBase;
    @Override
    public Employee add(Employee employee) {
        dataBase.getData().add(employee);
        return employee;
    }

    @Override
    public boolean delete(Employee employee) {
       return dataBase.getData().remove(employee);
    }

    @Override
    public Employee findById(Long id) {
        return dataBase.getData().stream()
                .filter(e -> e.getId() == id)
                .toList().stream()
                .findFirst()
                .orElseThrow(EmployeeNotFound::new);
    }

    @Override
    public List<Employee> findAll() {
        return dataBase.getData();
    }

    @Override
    public boolean contains(Employee employee) {
        return dataBase.getData().contains(employee);
    }

}
