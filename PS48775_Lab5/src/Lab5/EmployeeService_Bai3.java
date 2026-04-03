package Lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class EmployeeService_Bai3 {
	private List<Employee_Bai3> employees = new ArrayList<>();
	
	public void writeToFile(String filename) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(employees);
			System.out.println("Ghi danh sách nhân viên vào file thành công.");
		} catch (IOException e) {
			System.out.println("Lỗi khi ghi danh sách nhân viên vào file: " + e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	public void readFromFile(String filename) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			employees = (List<Employee_Bai3>) ois.readObject();
			System.out.println("Đọc danh sách nhân viên từ file thành công.");
		} catch (FileNotFoundException e) {
			System.out.println("File không tồn tại: " + e.getMessage());
		} catch (EOFException e) {
			System.out.println("File rỗng: " + e.getMessage());
		} catch (ClassNotFoundException | ClassCastException e) {
			System.out.println("Lỗi không đúng định dạng: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Lỗi khi đọc: " + e.getMessage());
		}
	}

	public void addEmployees(List<Employee_Bai3> newEmployees) {
		employees.addAll(newEmployees);
	}
	
	public List<Employee_Bai3> getEmployees() {
		return employees;
	}
	
	public void dungmanhinh() {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}
}
