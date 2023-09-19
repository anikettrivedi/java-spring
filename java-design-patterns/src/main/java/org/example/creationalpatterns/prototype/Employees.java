package org.example.creationalpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private List<String> employeeList;

    public Employees(){
        employeeList = new ArrayList<>();
    }

    public Employees(List<String> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(String s){
        employeeList.add(s);
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> cloneEmployeeList = new ArrayList<>(employeeList.size());
        cloneEmployeeList.addAll(employeeList);
        return new Employees(cloneEmployeeList);
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeList=" + employeeList +
                '}';
    }
}
