package org.example.structuralpatterns.composite;

import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    public void departmentTest(){
        HeadDepartment headDepartment = new HeadDepartment(1, "head-department");
        headDepartment.addDepartment(new FinancialDepartment());
        headDepartment.addDepartment(new SalesDepartment());
        headDepartment.printDepartmentName();
    }

}
