package Lab5;

import java.io.Serializable;

public class Employee_Bai3 implements Serializable {
	private String id;
	private String name;
	private double salary;

	public Employee_Bai3(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
	}
}
