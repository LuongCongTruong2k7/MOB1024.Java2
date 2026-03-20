package MainPackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import SinhVien.*;
import SinhVien.EnumSinhVien;
import SinhVien.EnumSinhVien.StudentType;

public class MainLab2_Bai1 {
	public static void main(String[] args) {
		Map<EnumSinhVien.StudentType, Integer> countMap = new EnumMap<>(StudentType.class);
		List<Student> listStudents = new ArrayList<Student>();
		listStudents.add(new Student("SV001", "Nguyễn Văn An", EnumSinhVien.StudentType.REGULAR));
		listStudents.add(new Student("SV002", "Trần Thị Bình", EnumSinhVien.StudentType.PART_TIME));
		listStudents.add(new Student("SV003", "John Wick", EnumSinhVien.StudentType.INTERNATIONAL));
		listStudents.add(new Student("SV004", "Lê Văn Cường", EnumSinhVien.StudentType.REGULAR));
		listStudents.add(new Student("SV005", "Akiko Tanaka", EnumSinhVien.StudentType.INTERNATIONAL));
		listStudents.add(new Student("SV006", "Phạm Minh Đức", EnumSinhVien.StudentType.PART_TIME));
		listStudents.add(new Student("ERR01", "Oni-chan", EnumSinhVien.StudentType.REGULAR));
		listStudents.add(new Student("SV007", "Lý Tiểu Long", EnumSinhVien.StudentType.REGULAR));
		
		
		if (listStudents.isEmpty()) {
			System.out.println("Không có sinh viên nào trong danh sách.");
		} else {
			System.out.println("Danh sách sinh viên:");
			for (Student sv : listStudents) {
				System.out.println(sv.toString());
			}
		}
		
//		int regularCount = 0;
//		int partTimeCount = 0;
//		int internationalCount = 0;
//		for (Student sv : listStudents) {
//			switch (sv.getType()) {
//				case REGULAR:
//					regularCount++;
//					break;
//				case PART_TIME:
//					partTimeCount++;
//					break;
//				case INTERNATIONAL:
//					internationalCount++;
//					break;
//			}
//		}
//		
//		System.out.println("Số lượng sinh viên theo loại:");
//		System.out.println("Regular: " + regularCount);
//		System.out.println("Part-time: " + partTimeCount);
//		System.out.println("International: " + internationalCount);
//	}
		
		for (StudentType type : StudentType.values()) {
			countMap.put(type, 0);
		}
		
		for (Student sv : listStudents) {
			StudentType type = sv.getType();
			countMap.put(type, countMap.get(type) + 1);
		}
		
		System.out.println("Số lượng sinh viên theo loại REGULAR: " + countMap.get(StudentType.REGULAR));
		System.out.println("Số lượng sinh viên theo loại PART_TIME: " + countMap.get(StudentType.PART_TIME));
		System.out.println("Số lượng sinh viên theo loại INTERNATIONAL: " + countMap.get(StudentType.INTERNATIONAL));
	}
}
