package SinhVien;

import SinhVien.EnumSinhVien.StudentType;

public class Student {
	String id;
	String name;
	EnumSinhVien.StudentType type;
	
	public Student(String id, String name, StudentType type) {
	    if (id == null || id.trim().isEmpty()) throw new IllegalArgumentException("ID không được để trống");
	    if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Tên không được để trống");
	    if (type == null) throw new IllegalArgumentException("Loại sinh viên không được null");
	    
	    this.id = id;
	    this.name = name;
	    this.type = type;
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
