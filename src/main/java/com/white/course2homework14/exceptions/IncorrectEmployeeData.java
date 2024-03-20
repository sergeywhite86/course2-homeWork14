package com.white.course2homework14.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IncorrectEmployeeData extends RuntimeException{
    public IncorrectEmployeeData() {
        super("Введите ФИО с большой буквы");
    }
}
