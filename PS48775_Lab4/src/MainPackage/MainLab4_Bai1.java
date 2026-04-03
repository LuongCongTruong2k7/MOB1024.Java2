package MainPackage;

import java.util.Scanner;
import SinhVien.*;

public class MainLab4_Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService svService = new StudentService();
        int choice = 0;
        do {
            try {
                System.out.println("1. Thêm sinh viên");
                System.out.println("2. Hiển thị danh sách sinh viên");
                System.out.println("3. Thoát");
                System.out.print("Vui lòng chọn chức năng: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        svService.addStudent();
                        svService.DungManHinh();
                        svService.XoaManHinh();
                        break;
                    case 2:
                        svService.showStudent();
                        svService.DungManHinh();
                        svService.XoaManHinh();
                        break;
                    case 3:
                        System.out.println("Thoát chương trình");
                        break;
                    default:
                        System.out.println("Vui lòng chọn đúng 1-3 chức năng");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi nhập liệu: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Lỗi: Nhập sai định dạng dữ liệu");
                sc.nextLine();
            } 
        } while (choice != 3);
    }
}
