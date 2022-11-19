package com.nri.comparators;

import java.util.Comparator;

import com.nri.model.Employee;

public class Salary implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getEmpSalary() == e2.getEmpSalary()) {
            return 0;
        } else if (e1.getEmpSalary() > e2.getEmpSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}
