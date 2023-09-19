package org.example.structuralpatterns.composite;

// leaf element
public class FinancialDepartment implements Department{

    // fields, constructors, getters, setters

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
