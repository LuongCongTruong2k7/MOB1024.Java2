package Slide2;

public class Student {
	public String studentId;
	public String name;
	public Double score;

	public Student(String studentId, String name, double score) {
		this.studentId = studentId;
		this.name = name;
		this.score = score;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", score=" + score + "]";
	}

}
