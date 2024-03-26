package com.white.course2homework14.service.constant;

import com.white.course2homework14.entitys.Employee;
import com.white.course2homework14.enums.Department;


import java.util.Arrays;
import java.util.List;

public class ConstantsForEmployeeServiceTest {

    public final static Employee EMP1 = new Employee("Светлана", "Солнцева", "Константиновна",
            Department.MANAGERS, 57000);
    public final static Employee EMP2 = new Employee("Анна", "Булкина", "Федоровна",
            Department.MANAGERS, 57000);
    public final static Employee EMP3 = new Employee("Аркадий", "Продавцов", "Николаевич",
            Department.MANAGERS, 52000);
    public final static Employee EMP4 = new Employee("Екатерина", "Певцова", "Ивановна",
            Department.MANAGERS, 65000);
    public final static Employee EMP5 = new Employee("Александр", "Купидонов", "Васильевич",
            Department.SECURITY, 59500);
    public final static Employee EMP6 = new Employee("Игнат", "Конь", "Николаевич",
            Department.SECURITY, 61000);
    public final static Employee EMP7 = new Employee("Иван", "Скала", "Игоревич",
            Department.SECURITY, 45000);
    public final static Employee EMP8 = new Employee("Игорь", "Рыбов", "Михайлович",
            Department.SECURITY, 52500);
    public final static Employee EMP9 = new Employee("Олег", "Путилов", "Иванович",
            Department.SECURITY, 53000);
    public final static Employee EMP10 = new Employee("Инокентий", "Джавов", "Олегович",
            Department.IT, 70000);
    public final static Employee EMP11 = new Employee("Ксения", "Плюсова", "Александровна",
            Department.IT, 150000);
    public final static Employee EMP12 = new Employee("Мария", "Кошкина", "Сергеевна",
            Department.IT, 85500);
    public final static Employee EMP13 = new Employee("Сергей", "Белый", "Сергеевич",
            Department.IT, 300000);
    public final static Employee EMP14 = new Employee("Сергей", "Бобылев", "Федорович",
            Department.ADMINISTRATION, 170000);
    public final static Employee EMP15 = new Employee("Марина", "Управова", "Ивановна",
            Department.ADMINISTRATION, 185500);
    public final static Employee EMP16 = new Employee("Роман", "Иванов", "Иванович",
            Department.ADMINISTRATION, 150000);
    public final static Employee EMP17 = new Employee("Лариса", "Поисковна", "Олеговна",
            Department.HR, 85300);
    public final static Employee EMP18 = new Employee("Иван", "Гусь", "Константинович",
            Department.HR, 50000);
    public final static Employee EMP19 = new Employee("Дмитрий", "Гришенков", "Викторович",
            Department.HR, 95000);
    public final static Employee EMP20 = new Employee("Лука", "Святой", "Михайлович",
            Department.HR, 50000);
    public static  List<Employee> EMPLOYEE_LIST = Arrays.asList(EMP1, EMP2, EMP3, EMP4, EMP5, EMP6, EMP7, EMP8, EMP9, EMP10, EMP11,
            EMP11, EMP12, EMP13, EMP14, EMP15, EMP16, EMP17, EMP18, EMP19, EMP20);

    public final static Employee EMP_WITH_ID_20 = EMP20;

    public static final Employee ADD_EMP = new Employee("Иван", "Варежкин", "Сергеевич",
            Department.SECURITY, 58000);

}

