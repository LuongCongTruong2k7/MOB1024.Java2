package MainPackage;

import NhanVien.*;
import SinhVien.*;

public class MainLab4_Bai3 {
    public static void main(String[] args) {
        GenericManager<Student> qlSinhVien = new GenericManager<>();
        qlSinhVien.add(new Student("SV01", "Lan", 3.5));
        qlSinhVien.add(new Student("SV02", "Linh", 3.0));
        qlSinhVien.display();

        System.out.println();

        GenericManager<Employee> qlNhanVien = new GenericManager<>();
        qlNhanVien.add(new Employee("NV01", "Tín", 5000));
        qlNhanVien.add(new Employee("NV02", "Huy", 6000));
        qlNhanVien.display();

        System.out.println("Tổng số lượng: " + (qlSinhVien.getSize() + qlNhanVien.getSize()));
    }
}
