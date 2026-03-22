package slide3;

import slide3.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Slide3Main {
	public static void main(String[] args) {
		List<Student> ls = new ArrayList<Student>();
		ls.add(new Student("SV001", "Nghĩa", 8));
		ls.add(new Student("SV002", "An", 5));
		ls.add(new Student("SV003", "Phát", 10));
		ls.add(new Student("SV004", "Nghia", 4));

//		Collections.sort(ls,(sv1,sv2) -> sv1.name.compareTo(sv2.name));
//		for (Student sv : ls) {
//			System.out.println(sv.toString());
//		}
		
//		Predicate<Student> isPass = sv -> sv.score >= 5;
//		Consumer<Student> checkandprint = sv -> {
//			if(isPass.test(sv))
//				System.out.println(sv.toString());
//		};
//		
//		Function<Student, String> returnPass = sv -> sv.score>=5?sv.toString() + "Đậu":sv.toString() + "Rớt";
		
//		ls.forEach(sv -> System.out.println(sv.toString()));
		
//		System.out.println("DS sinh viên: ");
//		for (Student sv : ls) {
//			if(sv.score >= 5)
//				System.out.println("Đậu");
//			else
//				System.out.println("Rớt");
//		}
		
		Predicate<Student> isPass = sv -> sv.score >= 5;
		
//		System.out.println("\nDS sinh viên: ");
//		for (Student sv : ls) {
//			if(isPass.test(sv))
//				System.out.println(" " + sv.name + " Đậu");
//			else
//				System.out.println(" " + sv.name + " Rớt");
//		}
		
//		Consumer<Student> checkandprint = sv -> {
//			if (isPass.test(sv)) {
//				System.out.println(sv.toString());
//			}
//		};
//		
//		
//		System.out.println("Check and Print");
//		ls.forEach(checkandprint);
		
		Function<Student, String> getInfo = sv -> sv.score >=5?sv.toString() + " Đậu":sv.toString() + " Rớt";
		
//		System.out.println("\nGet Info");
//		for (Student sv : ls) {
//			System.out.println(getInfo.apply(sv));
//		}
		
//		ls.forEach(sv -> System.out.println(getInfo.apply(sv)));
		
		System.out.println("Method Reference");
		ls.forEach(System.out::println);
	}
}