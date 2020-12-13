package org.computer.engineering.opesourceapplication;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
	

	@Id
	private int employeeNo;
	
	private String name;
	
	private String department;
	
	/**
	 * @return the employeeNo
	 */
	public int getEmployeeNo() {
		return employeeNo;
	}
	
	/**
	 * @param employeeNo the employeeNo to set
	 */
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
