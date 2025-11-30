package com.SpringBootQuestions.EmpManagerSelfReference;

public class EmployeeRepository {
    @Query("SELECT m FROM Employee m LEFT JOIN FETCH m.subordinates s WHERE m.id = :managerId")
    Optional<Employee> findManagerWithSubordinates(@Param("managerId") Long managerId);
}
