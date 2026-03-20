package MainPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import Slide2.Student;

public class Main_Student {
	public static void main(String[] args) {
		List<Student> listStudents = new ArrayList<Student>();
		Set<String> setStudents = new HashSet<String>();

		listStudents.add(new Student("SV01", "Nguyễn Văn A", 8.5));
		listStudents.add(new Student("SV02", "Nguyễn Văn A", 7.5));
		listStudents.add(new Student("SV03", "Nguyễn Văn A", 9.0));

		Comparator<Student> com = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Double.compare(o2.score, o1.score);
			}
		};

		listStudents.sort(com);
		for (Student sv : listStudents) {
			System.out.println(sv.toString());
		}



//		Student sv1 = new Student("SV04", "Nguyễn Văn A", 8.0);
//		if (!setStudents.contains(sv1.studentId)) {
//			listStudents.add(sv1);
//			setStudents.add(sv1.studentId);
//
//			System.out.println("Thêm sinh viên thành công: " + sv1.studentId);
//		} else {
//			System.out.println("Mã sinh viên đã tồn tại: " + sv1.studentId);
//		}
//		
//		for (Student sv : listStudents) {
//			if (sv.studentId.equals("SV01")) {
//				System.out.println("Đã tìm thấy sinh viên: " + sv.name);
//				sv.name = "Nguyễn Văn B";
//				System.out.println("Tên sinh viên sau khi cập nhật: " + sv.name);
//			}
//		}
//		
//		for (Student sv : listStudents) {
//			if (sv.studentId.equals("SV01")) {
//				listStudents.remove(sv);
//				setStudents.remove(sv.studentId);
//				System.out.println("Đã xóa sinh viên: " + sv.studentId);
//				System.out.println(listStudents.size());
//				break;
//			}
//		}
	}
}
