package main;

import java.util.List;
import java.util.Scanner;

import entity.Employee;
import repository.EmployeeRepository;
import util.ExceptionLogging;

public class Main {
    public static void dungManHinh(Scanner sc) {
        System.out.println("Nhấn Enter để tiếp tục");
        sc.nextLine();
    }

    public static void xoaManHinh() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            EmployeeRepository empRepo = new EmployeeRepository();
            
            while (true) {
                System.out.println("--- Quản lý nhân viên ---");
                System.out.println("1. Hiển thị tất cả nhân viên");
                System.out.println("2. Thêm nhân viên");
                System.out.println("3. Cập nhật nhân viên");
                System.out.println("4. Xóa nhân viên");
                System.out.println("5. Tìm nhân viên theo ID");
                System.out.println("0. Thoát");
                System.out.print("Lựa chọn: ");
                int chon = Integer.parseInt(sc.nextLine());
                switch (chon) {
                    case 1:
                    	List<Employee> emp = empRepo.findAll();
                    	if (emp.isEmpty()) {
                    		System.out.println("Không có nhân viên nào trong hệ thống.");
                    	} else {
                    		emp.forEach(e -> System.out.printf("ID: %d, Name: %s, Salary: %.2f%n", e.getId(), e.getName(), e.getSalary()));
                    	}
                        break;
                    case 2:
                    	System.out.print("Nhập tên nhân viên: ");
                    	String name = sc.nextLine();
                    	System.out.print("Nhập lương nhân viên: ");
                    	double salary = Double.parseDouble(sc.nextLine());
                    	if (empRepo.addEmployee(new Employee(0, name, salary))) {
                    		System.out.println("Thêm nhân viên thành công.");
						} else {
							System.out.println("Thêm nhân viên thất bại.");
                    	}
                        break;
                    case 3:
                    	System.out.print("Nhập ID nhân viên cần cập nhật: ");
                    	int updateId = Integer.parseInt(sc.nextLine());
                    	System.out.print("Nhập tên mới: ");
                    	String nameUpdate = sc.nextLine();
                    	System.out.print("Nhập lương mới: ");
                    	double salaryUpdate = Double.parseDouble(sc.nextLine());
                    	if (empRepo.updateEmployee(new Employee(updateId, nameUpdate, salaryUpdate))) {
                    		System.out.println("Cập nhật nhân viên thành công."); 
                    	} else {
                    		System.out.println("Cập nhật nhân viên thất bại.");
                    	}
                        break;
                    case 4:
                        System.out.print("Nhập ID nhân viên cần xóa: ");
                        int deleteId = Integer.parseInt(sc.nextLine());
                        if (empRepo.deleteEmployee(deleteId)) {
                            System.out.println("Xóa nhân viên thành công.");
                        } else {
                            System.out.println("Xóa nhân viên thất bại.");
                        }
                        break;
                    case 5:
                    	System.out.print("Nhập ID nhân viên cần tìm: ");
                    	int findId = Integer.parseInt(sc.nextLine());
                    	Employee empFind = empRepo.findById(findId);
                    	if (empFind != null) {
                    		System.out.printf("ID: %d, Name: %s, Salary: %.2f%n", empFind.getId(), empFind.getName(), empFind.getSalary());
                    	} else {
                    		System.out.println("Không tìm thấy nhân viên với ID đã nhập.");
                    	}
                        break;
                    case 0:
                        System.out.println("Thoát chương trình.");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                }
                dungManHinh(sc);
                xoaManHinh();
            }
        } catch (Exception e) {
            ExceptionLogging.batLoiHeThong(e);
            System.out.println("Có lỗi xảy ra. Vui lòng kiểm tra log để biết chi tiết."); 
        }
    }
}