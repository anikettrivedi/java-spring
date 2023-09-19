package org.example.creationalpatterns.prototype;

import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @Test
    public void cloneEmployeesTest() throws CloneNotSupportedException {

        Employees employees = new Employees();
        employees.addEmployee("abc");
        employees.addEmployee("xyz");

        Employees cloneOfEmployees = (Employees) employees.clone();
        cloneOfEmployees.addEmployee("pqr");

        System.out.println(employees);
        System.out.println(cloneOfEmployees);

    }

}
