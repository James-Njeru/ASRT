package com.example.asrt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.asrt.model.Employee;
import com.example.asrt.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public List<Employee> listAllEmployees() {
        return employeeRepository.findAll();
    }
     
    public void saveEmployee(Employee employee) {
    	Employee emp = new Employee();
    	
    	emp.setStaff_id(employee.getStaff_id());
    	emp.setStaff_name(employee.getStaff_name());
    	emp.setEmail(employee.getEmail());
    	emp.setPhone(employee.getPhone());
    	emp.setAddress(employee.getAddress());
    	emp.setJob_position(employee.getJob_position());
    	emp.setPassword(passwordEncoder.encode(employee.getPassword()));
    	
    	employeeRepository.save(emp);
    }
     
    public Employee getByStaffId(String id) {
        return employeeRepository.findById(id).get();
    }
     
    public void updateEmployee(Employee employee)
    {
    	employeeRepository.save(employee);
    }
    
    public void deleteEmployee(String id) {
    	employeeRepository.deleteById(id);
    }
}
