package com.white.course2homework14.service.constant;

import com.white.course2homework14.entitys.Employee;
import com.white.course2homework14.enums.Department;

import java.util.*;

import static com.white.course2homework14.enums.Department.*;


public class ConstantsForDepartmentServiceTest {
    public final static Employee EMP1 = new Employee("Светлана", "Солнцева", "Константиновна",
            MANAGERS, 57000);
    public final static Employee EMP2 = new Employee("Анна", "Булкина", "Федоровна",
            MANAGERS, 57000);
    public final static Employee EMP3 = new Employee("Аркадий", "Продавцов", "Николаевич",
            MANAGERS, 52000);
    public final static Employee EMP4 = new Employee("Екатерина", "Певцова", "Ивановна",
            MANAGERS, 65000);
    public final static Employee EMP5 = new Employee("Александр", "Купидонов", "Васильевич",
            SECURITY, 59500);
    public final static Employee EMP6 = new Employee("Игнат", "Конь", "Николаевич",
            SECURITY, 61000);
    public final static Employee EMP7 = new Employee("Иван", "Скала", "Игоревич",
            SECURITY, 45000);
    public final static Employee EMP8 = new Employee("Игорь", "Рыбов", "Михайлович",
            SECURITY, 52500);
    public final static Employee EMP9 = new Employee("Олег", "Путилов", "Иванович",
            SECURITY, 53000);
    public final static Employee EMP10 = new Employee("Инокентий", "Джавов", "Олегович",
            IT, 70000);
    public final static Employee EMP11 = new Employee("Ксения", "Плюсова", "Александровна",
            IT, 150000);
    public final static Employee EMP12 = new Employee("Мария", "Кошкина", "Сергеевна",
            IT, 85500);
    public final static Employee EMP13 = new Employee("Сергей", "Белый", "Сергеевич",
            IT, 300000);
    public final static Employee EMP14 = new Employee("Сергей", "Бобылев", "Федорович",
            ADMINISTRATION, 170000);
    public final static Employee EMP15 = new Employee("Марина", "Управова", "Ивановна",
            ADMINISTRATION, 185500);
    public final static Employee EMP16 = new Employee("Роман", "Иванов", "Иванович",
            ADMINISTRATION, 150000);
    public final static Employee EMP17 = new Employee("Лариса", "Поисковна", "Олеговна",
            HR, 85300);
    public final static Employee EMP18 = new Employee("Иван", "Гусь", "Константинович",
            HR, 50000);
    public final static Employee EMP19 = new Employee("Дмитрий", "Гришенков", "Викторович",
            HR, 95000);
    public final static Employee EMP20 = new Employee("Лука", "Святой", "Михайлович",
            HR, 50000);

    public static final List<Employee> EMPLOYEE_LIST_BY_1_DEP = Arrays.asList(EMP1, EMP2, EMP3, EMP4);
    public static final List<Employee> EMPLOYEE_LIST_BY_2_DEP = Arrays.asList(EMP5, EMP6, EMP7, EMP8, EMP9);
    public static final List<Employee> EMPLOYEE_LIST_BY_3_DEP = Arrays.asList(EMP10, EMP11, EMP12, EMP13);
    public static final List<Employee> EMPLOYEE_LIST_BY_4_DEP = Arrays.asList(EMP14, EMP15, EMP16);
    public static final List<Employee> EMPLOYEE_LIST_BY_5_DEP = Arrays.asList(EMP17, EMP18, EMP19, EMP20);
    public static List<Employee> EMPLOYEE_LIST_FOR_DEP = Arrays.asList(EMP1, EMP2, EMP3, EMP4, EMP5, EMP6, EMP7, EMP8,
            EMP9, EMP10, EMP11, EMP12, EMP13, EMP14, EMP15, EMP16, EMP17, EMP18, EMP19, EMP20);

    public static Map<Department, List<Employee>> DEPARTMENT_LIST_MAP = new HashMap<>();

    public static void initDepartmentMap() {
        DEPARTMENT_LIST_MAP.put(MANAGERS, EMPLOYEE_LIST_BY_1_DEP);
        DEPARTMENT_LIST_MAP.put(SECURITY, EMPLOYEE_LIST_BY_2_DEP);
        DEPARTMENT_LIST_MAP.put(IT, EMPLOYEE_LIST_BY_3_DEP);
        DEPARTMENT_LIST_MAP.put(ADMINISTRATION, EMPLOYEE_LIST_BY_4_DEP);
        DEPARTMENT_LIST_MAP.put(HR, EMPLOYEE_LIST_BY_5_DEP);
    }

}
