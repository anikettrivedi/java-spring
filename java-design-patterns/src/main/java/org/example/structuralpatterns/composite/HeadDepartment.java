package org.example.structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

// composite element
public class HeadDepartment implements Department{

    // fields, constructors, getters, setters
    private Integer id;
    private String name;
    private List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void addDepartment(Department department){
        childDepartments.add(department);
    }

    public void removeDepartment(Department department){
        childDepartments.remove(department);
    }

    @Override
    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
    }
}
