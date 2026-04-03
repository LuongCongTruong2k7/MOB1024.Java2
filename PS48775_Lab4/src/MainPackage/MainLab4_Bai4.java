package MainPackage;

import NhanVien.Employee;
import NhanVien.EmptyListException;
import NhanVien.GenericManager;
import SinhVien.Student;

public class MainLab4_Bai4 {
    public static void main(String[] args) {
        try {
        	GenericManager<Student> qlSinhVien = new GenericManager<>();
            qlSinhVien.add(new Student("SV01", "Lan", 3.5));
            qlSinhVien.add(new Student("SV02", "Linh", 3.0));
            qlSinhVien.display();
            System.out.println();

            GenericManager<Employee> qlNhanVien = new GenericManager<>();
            qlNhanVien.add(new Employee("NV01", "Tín", 5000));
            qlNhanVien.add(new Employee("NV02", "Huy", 6000));
            qlNhanVien.display();
            System.out.println();

            System.out.println("Tổng số lượng: " + (qlSinhVien.getSize() + qlNhanVien.getSize()));
            System.out.println();

            System.out.println("Phần tử đầu tiên: " + qlSinhVien.getFirst());
            System.out.println("Phần tử cuối cùng: " + qlSinhVien.getLast());
            System.out.println();
            System.out.println("Phần tử đầu tiên: " + qlNhanVien.getFirst());
            System.out.println("Phần tử cuối cùng: " + qlNhanVien.getLast());
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }
    }
}
