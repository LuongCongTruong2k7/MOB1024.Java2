package mainPackage;

import NhanVien.*;

import java.util.ArrayList;

public class MainLab1_Bai2 {
    public static void main(String[] args) {
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        
        listEmployee.add(new FullTimeEmployee("FT01", "Nguyen Van A", 10000000, 2000000, 500000));
        listEmployee.add(new PartTimeEmployee("PT01", "Tran Thi B", 0, 80, 50000));   
        listEmployee.add(new FullTimeEmployee("FT02", "Le Van C", -5000000, -100, 200000));
        listEmployee.add(new Employee("", "No ID User", 3000000));
        listEmployee.add(new PartTimeEmployee("PT02", "Expert Consultant", 0, 160, 200000));
        
        if (listEmployee.isEmpty()) {
            System.out.println("Danh sách nhân viên đang trống.");
        } else {
            Employee max = listEmployee.get(0);
            for (Employee e : listEmployee) {
                if (e.income() > max.income()) {
                    max = e;
                }
            }
            System.out.println("Danh sách nhân viên:");
            for (Employee e : listEmployee) {
            	System.out.println(e.toString());
			}
            System.out.println("Nhân viên có thu nhập cao nhất: " + max.toString());
        }
    }
}
