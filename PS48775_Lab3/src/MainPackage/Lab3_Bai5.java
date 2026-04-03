package MainPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import Lambda.*;
import Lambda.EnumSinhVien.StudentType;

public class Lab3_Bai5 {
    public static void main(String[] args) {
        List<Student> sv = new ArrayList<>();
        Map<StudentType, Long> countType = new HashMap<>();
        Map<StudentType, Double> gpavgType = new HashMap<>();
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

         countType = sv.stream().collect(Collectors.groupingBy(Student::getType,
         Collectors.counting()));
         System.out.println(countType);

         gpavgType = sv.stream()
         .collect(Collectors.groupingBy(Student::getType,
         Collectors.averagingDouble(Student::getGpa)));
         System.out.println(gpavgType);
         
         StudentType type = sv.stream().collect(Collectors.groupingBy(Student::getType,Collectors.averagingDouble(Student::getGpa)))
        		 .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
         System.out.println("Loại sinh viên có GPA trung bình cao nhất: " + type);
    }
}
