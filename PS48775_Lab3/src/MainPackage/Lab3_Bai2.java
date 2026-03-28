package MainPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import Lambda.*;

public class Lab3_Bai2 {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("1", "Anh Hải", 16000000));
        emp.add(new Employee("2", "Hùng", 15000000));
        emp.add(new Employee("3", "Huy", 14000000));
        emp.add(new Employee("4", "Hạnh", 13000000));
        emp.add(new Employee("5", "Hương", 12000000));
        emp.add(new Employee("6", "Trường", 11000000));
        emp.add(new Employee("7", "Triết", 10000000));
        emp.add(new Employee("8", "Duy", 80000));
    	
//        Giả sử list 'emp' đã có dữ liệu
//        Stream<Employee> highSalaryStream = emp.stream().filter(e -> e.getSalary() >= 15000000);
//
//        Thao tác 1: In ra màn hình (Terminal operation)
//        highSalaryStream.forEach(e -> System.out.println(e.getName()));
//
//        Thao tác 2: Đếm số lượng (Terminal operation)
//        long count = highSalaryStream.count(); // ❌ LỖI RUNTIME: IllegalStateException
        
//        Cách sửa: Lưu kết quả vào List trước (vì ta cần dùng nhiều lần)
//        List<Employee> highSalaryEmployees = emp.stream().filter(e -> e.getSalary() >= 15000000).collect(Collectors.toList());
//        highSalaryEmployees.forEach(e -> System.out.println(e.getName()));
//        long count = highSalaryEmployees.size();
        
       emp.stream().filter(e -> e.getSalary() >= 15000000).forEach(e -> System.out.println(e));
//
//        emp.stream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).forEach(e -> System.out.println(e));
//
//        emp.stream().map(e -> e.getName()).forEach(e -> System.out.println(e));
//
//        long count = emp.stream().filter(e -> e.getName().toLowerCase().startsWith("a")).count();
//        System.out.println(count);  
    }
}
