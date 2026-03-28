package MainPackage;

import java.util.ArrayList;
import java.util.List;
import Lambda.*;
import Lambda.EnumSinhVien.StudentType;

public class Lab3_Bai4 {
    public static void main(String[] args) {
        List<Student> sv = new ArrayList<>();
        sv.add(new Student("SV001", "Lương Công Trường", StudentType.REGULAR, 3.2));
        sv.add(new Student("SV002", "Nguyễn Văn A", StudentType.PART_TIME, 2.5));
        sv.add(new Student("SV003", "Trần Văn B", StudentType.INTERNATIONAL, 3.0));
        sv.add(new Student("SV004", "Trần Văn C", StudentType.REGULAR, 2.8));
        sv.add(new Student("SV005", "Trần Văn D", StudentType.PART_TIME, 3.5));
        sv.add(new Student("SV006", "Trần Văn E", StudentType.INTERNATIONAL, 2.9));
        sv.add(new Student("SV007", "Trần Văn F", StudentType.REGULAR, 3.9));
        sv.add(new Student("SV008", "Trần Văn G", StudentType.PART_TIME, 2.7));
        sv.add(new Student("SV009", "Trần Văn H", StudentType.INTERNATIONAL, 3.3));
        sv.add(new Student("SV010", "Trần Văn I", StudentType.REGULAR, 2.6));
        
//        sv.stream()
//        .sorted((s1, s2) -> {
//            Double.compare(s2.getGpa(), s1.getGpa()); // ❌ LỖI COMPILER: Missing return statement
//        })
//        .forEach(s -> System.out.println(s));
//        Cách sửa Lambda một dòng (Biểu thức - Expression) -> Tự động return
//        sv.stream().sorted((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa())).forEach(System.out::println);
        
        

        // sv.stream().filter(s -> s.getType() == StudentType.INTERNATIONAL && s.getGpa() >= 3.2)
        //         .forEach(s -> System.out.println(s));

        // sv.stream().sorted((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()))
        //         .limit(3)
        //         .forEach(s -> System.out.println(s));

//        sv.stream().filter(s -> s.getType() == StudentType.PART_TIME)
//                .map(s -> s.getName())
//                .forEach(s -> System.out.println(s));
    }
}
