package com.nri.comparators;

import java.util.Comparator;

import com.nri.model.Employee;

public class NameId implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getEmpName().equals(e2.getEmpName())) {
            if (e1.getEmpid() == e2.getEmpid()) {
                return 0;
            } else if (e1.getEmpid() > e2.getEmpid()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
