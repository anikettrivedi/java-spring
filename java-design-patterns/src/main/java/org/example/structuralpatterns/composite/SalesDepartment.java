package org.example.structuralpatterns.composite;

// leaf element
public class SalesDepartment implements Department{

    // fields, constructors, getters, setters

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
