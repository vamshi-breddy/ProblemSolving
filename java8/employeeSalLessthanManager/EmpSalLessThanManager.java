package com.java8.employeeSalLessthanManager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpSalLessThanManager {

    public static void main(String[] args) {
        List<Employees> employeesList = new ArrayList<>();

        employeesList.add(new Employees("1",'E',1000));
        employeesList.add(new Employees("2",'M',888));
        employeesList.add(new Employees("3",'E',999));
        employeesList.add(new Employees("4",'E',777));

        int mSalary;

        mSalary = employeesList.stream().filter(e->e.getEmpDesignation().equals('M')).collect(Collectors.toList()).get(0).getSalary();

        employeesList.stream().filter(e->e.getEmpDesignation().equals('E') && e.getSalary()>mSalary).collect(Collectors.toList())
                .forEach(e->System.out.print(e.getEmpId()+" "));
    }
}
