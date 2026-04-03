package SinhVien;

public class Student {
    private String id;
    private String name;
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, double gpa) {
        this.setId(id);
        this.setName(name);
        this.setGpa(gpa);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID không được rỗng");
        } else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name không được rỗng");
        } else {
            this.name = name;
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 4) {
            throw new IllegalArgumentException("GPA phải nằm trong khoảng 0 đến 4");
        } else {
            this.gpa = gpa;
        }
    }

    public void inThongTin() {
        System.out.println("ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa;
    }
}
