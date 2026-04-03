package SinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
	List<Student> lsStudents = new ArrayList<>();

	public void addStudent() {
		Student sv = new Student();
		Scanner sc = new Scanner(System.in);
		String id = "";
		boolean isIdValid = false;
		do {
			System.out.print("Nhập ID: ");
			id = sc.nextLine();
			try {
				DuplicateStudentIdException(id);
				isIdValid = true;
			} catch (DuplicateStudentIdException e) {
				System.out.println("Lỗi ID bị trùng " + e.getMessage());
			}
		} while (!isIdValid);
		sv.setId(id);
		System.out.print("Nhập Name: ");
		sv.setName(sc.nextLine());
		System.out.print("Nhập GPA: ");
		sv.setGpa(sc.nextDouble());
		sc.nextLine();
		lsStudents.add(sv);
	}

	public void showStudent() {
		if (lsStudents.isEmpty()) {
			System.out.println("Danh sách sinh viên trống");
			return;
		}
		for (Student s : lsStudents) {
			s.inThongTin();
		}
	}

	public void DungManHinh() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhấn Enter để quay lại menu");
		sc.nextLine();
	}

	public void XoaManHinh() {
		for (int i = 0; i <= 50; i++)
			System.out.println();
	}

	public boolean isIdExist(String id) {
		for (Student s : lsStudents) {
			if (s.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	public void DuplicateStudentIdException(String id) throws DuplicateStudentIdException {
		if (isIdExist(id.toLowerCase())) {
			throw new DuplicateStudentIdException("Mã sinh viên " + id + " đã tồn tại");
		}
	}
}
