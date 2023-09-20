package com.mant.pojo;

import java.math.BigDecimal;

public class Job {
	private String name;
	private BigDecimal salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String toString(){
		return "Name: " + name + ", Salary: " + salary;
	}
	
}
