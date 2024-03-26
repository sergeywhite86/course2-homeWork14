package com.white.course2homework14.service;


import com.white.course2homework14.entitys.Employee;
import com.white.course2homework14.exceptions.EmployeeAlreadyAdded;
import com.white.course2homework14.exceptions.EmployeeNotFound;
import com.white.course2homework14.exceptions.IncorrectEmployeeData;
import com.white.course2homework14.repository.EmployeeRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static com.white.course2homework14.service.constant.ConstantsForEmployeeServiceTest.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {
    @InjectMocks
    private EmployeeServiceImpl out ;

    @Mock
    private EmployeeRepositoryImpl repositoryMock;

    @Test
    void add_When_Employee_NotExist() {
        when(repositoryMock.add(ADD_EMP)).thenReturn(ADD_EMP);
        Employee actual = out.add(ADD_EMP.getName(), ADD_EMP.getSurName(), ADD_EMP.getPatronymic(),
                ADD_EMP.getDepartment(), ADD_EMP.getSalary());
        verify(repositoryMock, times(1)).add(ADD_EMP);
        assertEquals(ADD_EMP, actual);
    }

    @Test
    void add_Throw_EmployeeAlreadyAdded_When_Employee_Exist() {
        when(repositoryMock.add(EMP1)).thenThrow(EmployeeAlreadyAdded.class);
        assertThrows(EmployeeAlreadyAdded.class, () -> out.add(EMP1.getName(), EMP1.getSurName(), EMP1.getPatronymic(),
                EMP1.getDepartment(), EMP1.getSalary()));
    }

    @Test
    void add_Throw_IncorrectEmployeeData_When_Incorrect_Name_SurName_Patronymic() {
        assertThrows(IncorrectEmployeeData.class, () -> out.add("1", ADD_EMP.getSurName(), ADD_EMP.getPatronymic(),
                ADD_EMP.getDepartment(), ADD_EMP.getSalary()));
        assertThrows(IncorrectEmployeeData.class, () -> out.add(ADD_EMP.getName(), "1", ADD_EMP.getPatronymic(),
                ADD_EMP.getDepartment(), ADD_EMP.getSalary()));
        assertThrows(IncorrectEmployeeData.class, () -> out.add(ADD_EMP.getName(), ADD_EMP.getSurName(), "1",
                ADD_EMP.getDepartment(), ADD_EMP.getSalary()));

    }

    @Test
    void deleteById_When_Id_Exist() {
        when(repositoryMock.delete(EMP1)).thenReturn(true);
        when(repositoryMock.findById(1L)).thenReturn(EMP1);
        boolean actual = out.deleteById(1L);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void deleteById_When_Id_Not_Exist() {
        when(repositoryMock.findById(eq(22L))).thenThrow(EmployeeNotFound.class);
        assertThrows(EmployeeNotFound.class, () -> out.findById(22L));
    }
    @Test
    void findById_WhenThey_Exist() {
        when(repositoryMock.findById(eq(20L))).thenReturn(EMP_WITH_ID_20);
        Employee actual = out.findById(20L);
        assertEquals(EMP20, actual);
    }

    @Test
    void findById_Throw_EmployeeNotFound_WhenThey_Not_Exist() {
        when(repositoryMock.findById(eq(22L))).thenThrow(EmployeeNotFound.class);
        assertThrows(EmployeeNotFound.class, () -> out.findById(22L));
    }

    @Test
    void findAll_Is_Ok() {
        when(repositoryMock.findAll()).thenReturn(EMPLOYEE_LIST);
        List<Employee> actual = out.findAll();
        assertIterableEquals(EMPLOYEE_LIST, actual);
    }
}