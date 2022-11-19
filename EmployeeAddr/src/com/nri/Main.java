package com.nri;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.nri.comparators.NameId;
import com.nri.comparators.Salary;
import com.nri.model.Address;
import com.nri.model.Employee;

public class Main {
    public static void main(String[] args) {
        
    	
    	List<Employee> empList = new ArrayList<>();
    	
    	Address adrOne = new Address(51, "MahisBathan", "Kolkata", "West Bengal", 785488);

    	Employee empOne = new Employee(11, "Sandeep Chowdhury", adrOne, 75000);
        
        empList.add(empOne);
        
        Address adrTwo = new Address(52, "Park Street", "Kolkata", "West Bengal", 785488);

    	Employee empTwo = new Employee(12, "Sourav Chowdhury", adrTwo, 60000);
        
        empList.add(empTwo);
        
        Address adrThree = new Address(52, "Rambandh", "Asansol", "West Bengal", 785488);

    	Employee empThree = new Employee(13, "Sourav Rao", adrThree, 50000);
        
        empList.add(empThree);

        
        // Sort the Employees based on their Salary
        System.out.println("Sorting By Salary:-  ");
        Comparator<Employee> comparator = new Salary();
        empList.sort(comparator);
        empList.forEach(System.out::println);


        // Sort the Employees based on their Name and ID
        System.out.println("Sorting By Name:- ");
        comparator = new NameId();
        empList.sort(comparator);
        empList.forEach(System.out::println);
    }
}
