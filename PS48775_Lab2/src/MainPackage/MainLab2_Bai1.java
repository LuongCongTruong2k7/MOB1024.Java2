package MainPackage;

import java.util.ArrayList;
import java.util.List;
import SinhVien.*;
import SinhVien.EnumSinhVien;
import SinhVien.EnumSinhVien.StudentType;

public class MainLab2_Bai1 {
	public static void main(String[] args) {
		List<Student> listStudents = new ArrayList<Student>();
		listStudents.add(new Student("SV001", "Nguyễn Văn An", EnumSinhVien.StudentType.REGULAR));
		listStudents.add(new Student("SV002", "Trần Thị Hai", EnumSinhVien.StudentType.PART_TIME));
		listStudents.add(new Student("SV003", "John Wick", EnumSinhVien.StudentType.INTERNATIONAL));
		listStudents.add(new Student("SV004", "Lê Văn Cường", EnumSinhVien.StudentType.REGULAR));
		listStudents.add(new Student("SV005", "Akiko Tanaka", EnumSinhVien.StudentType.INTERNATIONAL));
		listStudents.add(new Student("SV006", "Phạm Minh Đức", EnumSinhVien.StudentType.PART_TIME));
		listStudents.add(new Student("ERR01", "", EnumSinhVien.StudentType.REGULAR));
		listStudents.add(new Student("", "Lý Tiểu Long", null));
		
		
		if (listStudents.isEmpty()) {
			System.out.println("rỗng");
		} else {
			System.out.println("danh sách toàn bộ sinh viên");
			for (Student sv : listStudents) {
				System.out.println(sv.toString());
			}
		}
		
		for (StudentType type : StudentType.values()) {
			int count = 0;
			for (Student sv : listStudents) {
				if (sv.getType() == type) {
					count++;
				}
			}
			System.out.println("số lượng của sinh viên mỗi loại là " + type + ":" + count);
			for (Student sv : listStudents) {
				if (sv.getType() == type) {
					System.out.println(sv.toString());
				}
			}
		}
	}
}
