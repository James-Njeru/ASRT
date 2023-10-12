package com.example.asrt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.asrt.model.Work_order;

@Repository
public interface OrderBySystemRepository extends JpaRepository<Work_order, String> {
	
	@Query("SELECT w FROM Work_order w WHERE w.system_name = :system_name")
	List<Work_order> findOrderBySystemName(@Param("system_name") String system_name);
}
