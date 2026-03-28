package MainPackage;

import java.util.ArrayList;
import java.util.List;
import Lambda.*;

public class Lab3_Bai3 {
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

        // Lấy lương cao nhất
        // double maxSalary = emp.stream()
        // .mapToDouble(e -> e.getSalary())
        // .max(); // ❌ LỖI COMPILER
        // Cách sửa: Dùng ifPresent để xử lý an toàn
        // emp.stream()
        // .mapToDouble(Employee::getSalary)
        // .max()
        // .ifPresent(max -> System.out.println("Lương cao nhất: " + max));

        // double sum = emp.stream().mapToDouble(e -> e.getSalary()).sum();
        // System.out.printf("Tổng lương: %.2f\n", sum);

        // double avg = emp.stream().mapToDouble(e ->
        // e.getSalary()).average().getAsDouble();
        // System.out.printf("Lương trung bình: %.2f\n", avg);

        // double max = emp.stream().mapToDouble(e ->
        // e.getSalary()).max().getAsDouble();
        // System.out.printf("Lương cao nhất: %.2f\n", max);
    }
}
