package com.white.course2homework14.service;

import com.white.course2homework14.entitys.Employee;
import com.white.course2homework14.enums.Department;
import com.white.course2homework14.exceptions.EmployeeNotFound;
import com.white.course2homework14.repository.EmployeeRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Map;

import static com.white.course2homework14.service.constant.ConstantsForDepartmentServiceTest.*;
import static com.white.course2homework14.service.constant.ConstantsForDepartmentServiceTest.EMP16;
import static com.white.course2homework14.service.constant.ConstantsForDepartmentServiceTest.EMP4;
import static com.white.course2homework14.service.constant.ConstantsForEmployeeServiceTest.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class DepartmentServiceImplTest {
    @InjectMocks
    private DepartmentServiceImpl out;

    @Mock
    private EmployeeRepositoryImpl repositoryMock;

    @Test
    void empWithMaxSalaryByDepartment_Then_They_Exist() {
        when(repositoryMock.findAll()).thenReturn(EMPLOYEE_LIST);
        Employee actual = out.empWithMaxSalaryByDepartment(1);
        assertEquals(EMP4, actual);
    }

    @Test
    void empWithMaxSalaryByDepartment_Throw_EmployeeNotFound_Then_They_Not_Exist() {
        assertThrows(EmployeeNotFound.class, () -> out.empWithMaxSalaryByDepartment(10));
    }

    @Test
    void empWithMinSalaryByDepartment_Then_They_Exist() {
        when(repositoryMock.findAll()).thenReturn(EMPLOYEE_LIST);
        Employee actual = out.empWithMinSalaryByDepartment(4);
        assertEquals(EMP16, actual);
    }

    @Test
    void empWithMinSalaryByDepartment_Then_They_Not_Exist() {
        assertThrows(EmployeeNotFound.class, () -> out.empWithMinSalaryByDepartment(10));
    }

    @Test
    void findAllByDepartment_Is_Ok() {
        when(repositoryMock.findAll()).thenReturn(EMPLOYEE_LIST);
        List<Employee> expected = EMPLOYEE_LIST_BY_1_DEP;
        List<Employee> actual = out.findAllByDepartment(1);
        assertIterableEquals(expected, actual);
    }

    @Test
    void findEmployeesByDepartment() {
        initDepartmentMap();
        when(repositoryMock.findAll()).thenReturn(EMPLOYEE_LIST_FOR_DEP);
        Map<Department, List<Employee>> expected = DEPARTMENT_LIST_MAP;
        assertEquals(expected, out.findEmployeesByDepartment());
    }
}