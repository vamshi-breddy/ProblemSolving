package com.java8.employeeSalLessthanManager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employees {

    private String empId;

    private Character empDesignation;

    private int salary;
}
