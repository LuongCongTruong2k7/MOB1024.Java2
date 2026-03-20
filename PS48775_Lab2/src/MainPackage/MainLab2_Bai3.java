package MainPackage;

import java.util.Scanner;

import NhanVien.*;

public class MainLab2_Bai3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {
        	try {
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Tìm nhân viên theo ID");
            System.out.println("4. Cập nhật lương nhân viên");
            System.out.println("0. Thoát");

            System.out.print("Chọn: ");
            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    String id = s.nextLine();

                    System.out.print("Nhập tên: ");
                    String name = s.nextLine();

                    System.out.print("Nhập lương: ");
                    double salary = s.nextDouble();

                    service.add(new Employee(id, name, salary));
                    break;

                case 2:
                    service.show();
                    break;

                case 3:
                    System.out.print("Nhập ID nhân viên cần tìm: ");
                    String findId = s.nextLine();

                    Employee e = service.findById(findId);
                    if (e != null) {
                        System.out.println(e);
                    } else {
                        System.out.println("Không tim thấy nhân viên với ID: " + findId);
                    }
                    break;

                case 4:
                    System.out.print("Nhập ID: ");
                    String updateId = s.nextLine();

                    System.out.print("Nhập lương mới: ");
                    double newSalary = s.nextDouble();

                    service.updateSalary(updateId, newSalary);
                    break;

                case 0:
                    System.out.println("Thoát");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            	} 
            } catch (Exception e) {
                System.out.println("Vui lòng nhập đúng định dạng. Lỗi");
                s.nextLine(); 
                }
        	}
    	}
	}