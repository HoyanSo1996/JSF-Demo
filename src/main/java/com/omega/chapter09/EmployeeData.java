package com.omega.chapter09;

import lombok.Data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class EmployeeData
 *
 * @author KennySu
 * @date 2023/10/31
 */
@ManagedBean
@SessionScoped
@Data
public class EmployeeData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String dept;
    private int age;
    private double salary;

    private static final Employee[] employeeArray =  new Employee[] {
            new Employee("John", "Marketing", 30,2000.00),
            new Employee("Robert", "Marketing", 35,3000.00),
            new Employee("Mark", "Sales", 25,2500.00),
            new Employee("Chris", "Marketing", 33,2500.00),
            new Employee("Peter", "Customer Care", 20,1500.00)
    };

    private ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(employeeArray));


    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public String addEmployee() {
        Employee employee = new Employee(name, dept, age, salary);
        employees.add(employee);
        return null;
    }

    public String deleteEmployee(Employee employee) {
        employees.remove(employee);
        return null;
    }

    public String editEmployee(Employee employee) {
        employee.setCanEdit(true);
        return null;
    }

    public String saveEmployees() {
        //set "canEdit" of all employees to false
        for (Employee employee : employees) {
            employee.setCanEdit(false);
        }
        return null;
    }


}
