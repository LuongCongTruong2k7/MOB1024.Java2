package Lab5;

import java.io.Serializable;

public class Model_Bai2 implements Serializable{
	private String id;
    private String name;
    private double gpa;
    
	public Model_Bai2(String id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
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
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Model_Bai2 [id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
	}
}
