package SinhVien;

import SinhVien.EnumSinhVien.StudentType;

public class Student {
	private String id;
	private String name;
	private EnumSinhVien.StudentType type;
	
	public Student(String id, String name, StudentType type) { 
	    this.setId(id);
	    this.setName(name);
	    this.type = type;
	}

	public String getId() {
		return id;
	}

	public boolean setId(String id) {
		if (id != "") {
			this.id = id;
			return true;
		}
		this.id = "Quên nhập id rồi Nàng";
		return false;
	}

	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		if (name != "") {
			this.name = name;
			return true;
		} else {
			this.name = "Quên nhập tên rồi Nàng";
			return false;
		}
	}

	public EnumSinhVien.StudentType getType() {
		return type;
	}

	public void setType(EnumSinhVien.StudentType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
}
