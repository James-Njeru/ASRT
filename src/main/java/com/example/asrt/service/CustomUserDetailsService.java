
package com.example.asrt.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.asrt.model.Employee;
import com.example.asrt.repository.EmployeeRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	private EmployeeRepository employeeRepository;

	public CustomUserDetailsService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public UserDetails loadUserByUsername(String staffNo) throws UsernameNotFoundException {
		Employee employee = employeeRepository.findUserByStaffId(staffNo);
		if (employee == null) {
			throw new UsernameNotFoundException("UserName/Password mismatch");
		}
		//List<String> roles = Arrays.asList(employee.getJob_position());
		UserDetails userDetails = org.springframework.security.core.userdetails.User.builder()
				.username(employee.getStaff_id()).password(employee.getPassword()).roles("USER").build();

		return userDetails;
	}

}
