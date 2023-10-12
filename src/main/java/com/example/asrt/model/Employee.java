
package com.example.asrt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private String staff_id;
	private String staff_name;
	private String email;
	private String phone;
	private String address;
	private String job_position;
	private String password;

	public Employee() {
	}

	public Employee(String staff_id, String staff_name, String email, String phone, String address, String job_position,
			String password) {
		this.staff_id = staff_id;
		this.staff_name = staff_name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.job_position = job_position;
		this.password = password;
	}

	public String getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	public String getStaff_name() {
		return staff_name;
	}

	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJob_position() {
		return job_position;
	}

	public void setJob_position(String job_position) {
		this.job_position = job_position;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
