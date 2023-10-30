package com.omega.chapter09;

import lombok.Data;

/**
 * Class Employee
 *
 * @author KennySu
 * @date 2023/10/31
 */
@Data
public class Employee {

    private String name;
    private String department;
    private int age;
    private double salary;
    private boolean canEdit;

    public Employee(String name, String department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        canEdit = false;
    }
}
