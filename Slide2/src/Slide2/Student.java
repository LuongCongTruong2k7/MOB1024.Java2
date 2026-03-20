package Slide2;

public class Student {
	public String studentId;
	public String name;
	public double score;

	public Student(String studentId, String name, double score) {
		this.studentId = studentId;
		this.name = name;
		this.score = score;
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", score=" + score + "]";
	}

}
