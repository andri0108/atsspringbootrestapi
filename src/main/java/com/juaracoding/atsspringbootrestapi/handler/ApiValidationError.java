package com.juaracoding.atsspringbootrestapi.handler;
/*
IntelliJ IDEA 2023.2 (Community Edition)
Build #IC-232.8660.185, built on July 26, 2023
@Author EmiratZ a.k.a. M Emirat Millenium Try
Java Developer
Created on 31/08/2023 14.24
@Last Modified 31/08/2023 14.24
Version 1.0
*/

public class ApiValidationError {
    private String object;
    private String field;
    private Object rejectedValue;
    private String message;

    ApiValidationError(String field, String message, Object rejectedValue, String object) {

        this.object = object;
        this.message = message;
        this.rejectedValue=rejectedValue;
        this.field = field;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Object getRejectedValue() {
        return rejectedValue;
    }

    public void setRejectedValue(Object rejectedValue) {
        this.rejectedValue = rejectedValue;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}