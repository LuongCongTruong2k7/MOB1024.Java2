package MainPackage;

import java.util.Scanner;
import NhanVien.*;

public class MainLab4_Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService empService = new EmployeeService();

        int choice = 0;
        do {
            try {
                System.out.println("1. Thêm nhân viên");
                System.out.println("2. Tìm nhân viên theo ID");
                System.out.println("3. Thoát");
                System.out.print("Vui lòng chọn chức năng: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Nhập ID: ");
                        String id = sc.next();
                        System.out.print("Nhập tên: ");
                        String name = sc.next();
                        System.out.print("Nhập lương: ");
                        double salary = sc.nextDouble();
                        Employee emp = new Employee(id, name, salary);
                        empService.addEmployee(emp);
                        System.out.println("Thêm nhân viên thành công");
                        break;
                    case 2:
                        System.out.print("Nhập ID cần tìm: ");
                        String searchId = sc.next();
                        Employee foundEmp = empService.findEmployeeByID(searchId);
                        if (foundEmp != null) {
                            foundEmp.inThongTin();
                        } else {
                            System.out.println("Không tìm thấy nhân viên với ID: " + searchId);
                        }
                        break;
                    case 3:
                        System.out.println("Thoát chương trình");
                        break;
                    default:
                        System.out.println("Vui lòng chọn đúng 1-3 chức năng");
                }
            } catch (DuplicateEmployeeException e) {
                System.out.println("Lỗi trùng lặp: " + e.getMessage());
            } catch (InvalidSalaryException e) {
                System.out.println("Lỗi lương âm: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Lỗi: phải nhập vào một số nguyên");
                sc.nextLine();
            }
        } while (choice != 3);
    }
}
