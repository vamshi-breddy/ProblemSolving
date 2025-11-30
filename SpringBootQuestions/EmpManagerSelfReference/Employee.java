package com.SpringBootQuestions.EmpManagerSelfReference;

import jakarta.persistence.*;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String title;

    // --- MANAGER SIDE (The "Many" in ManyToOne) ---
    // This column holds the foreign key (manager_id) linking to another Employee's ID.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private Employee manager;

    // --- EMPLOYEE SIDE (The "One" in OneToMany) ---
    // This collection represents all employees who report to this manager.
    // 'mappedBy' points to the 'manager' field in the subordinate Employee entity.
    @OneToMany(mappedBy = "manager", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Employee> subordinates = new HashSet<>();
}
