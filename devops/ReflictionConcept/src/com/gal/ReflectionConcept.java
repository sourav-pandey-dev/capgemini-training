package com.gal;

import java.lang.reflect.Field;

public class ReflectionConcept {

    public static void main(String[] args) throws Exception {

        Employee emp = new Employee();

        Class<?> c = emp.getClass();

        Field[] fields = c.getDeclaredFields();

        for (Field f : fields) {

            f.setAccessible(true);

            String fieldName = f.getName();

            Object value = f.get(emp);

            System.out.println(fieldName + " = " + value);
        }
    }
}