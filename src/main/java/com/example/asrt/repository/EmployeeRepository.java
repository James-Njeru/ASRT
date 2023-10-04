package com.example.asrt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.asrt.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
	
	@Query("SELECT u FROM Employee u WHERE u.staff_id = :staff_id")
    Employee findUserByStaffId(@Param("staff_id") String staff_id);
}
