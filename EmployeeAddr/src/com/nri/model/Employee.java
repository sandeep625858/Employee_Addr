package com.nri.model;

public class Employee {
    private int empid;
    private String empName;
    private Address empAddress;
    private double empSalary;

    public Employee() {}

    public Employee(int empid, String empName, Address empAddress, double empSalary) {
        this.empid = empid;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empSalary = empSalary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Address getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(Address empAddress) {
        this.empAddress = empAddress;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empName='" + empName + '\'' +
                ", empAddress=" + empAddress +
                ", empSalary=" + empSalary +
                '}';
    }
}
