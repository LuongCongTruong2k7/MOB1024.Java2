package MainPackage;

import java.util.Scanner;
import NhanVien.*;

public class MainLab2_Bai3 {
	public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        Scanner s = new Scanner(System.in);
        int choice = 0;

        do {
            try {
                System.out.println("1. Thêm nhân viên");
                System.out.println("2. Hiển thị danh sách");
                System.out.println("3. Tìm nhân viên theo mã");
                System.out.println("4. Cập nhật lương");
                System.out.println("0. Thoát");
                System.out.print("Chọn chức năng: ");
                choice = s.nextInt();
                s.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Nhập mã nhân viên: ");
                        String id = s.nextLine();
                        System.out.print("Nhập tên nhân viên: ");
                        String name = s.nextLine();
                        System.out.print("Nhập lương nhân viên: ");
                        double salary = s.nextDouble();
                        service.addEmployee(new Employee(id, name, salary));
                        break;
                    case 2:
                        service.displayAll();
                        break;
                    case 3:
                    	System.out.print("Nhập mã nhân viên cần tìm: ");
                        String searchId = s.nextLine();
                        service.findById(searchId);
                        break;
                    case 4:
                        System.out.print("Nhập mã nhân viên cần cập nhật lương: ");
                        String updateId = s.nextLine();
                        System.out.print("Nhập lương mới: ");
                        double newSalary = s.nextDouble();
                        service.updateSalary(updateId, newSalary);
                        break;
                    case 0:
                        System.out.println("Tạm biệt");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ");
                }
            } catch (Exception e) {
                System.out.println("Lỗi");
                s.nextLine();
            }
        } while (choice != 0);
    }
}
