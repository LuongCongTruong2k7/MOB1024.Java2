package MainPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Lab3_Bai1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hải");
		list.add("Hùng");
		list.add("Huy");
		list.add("Hạnh");
		list.add("Hương");
		list.add("Trường");
		list.add("Triết");
		list.add("Duy");
		list.add("Thiên");
		list.add("Tú");
		list.add("Lợi");
		
//		List<String> list = Arrays.asList("Hải", "Hùng", "Trường", "Triết");
//		int count = 0;
//
//		list.forEach(name -> {
//		    if (name.length() > 5) {
//		        count++; // ❌ LỖI COMPILER TẠI ĐÂY
//		    }
//		});
//		Cách sửa: Sử dụng đúng sức mạnh của Stream API để tính toán
//		long count = list.stream().filter(name -> name.length() > 5).count();
//		System.out.println("Số lượng tên dài hơn 5 ký tự: " + count);

		list.forEach(name -> System.out.println(name));
//
//		list.forEach(System.out::println); // dùng method references

//		 Predicate<String> checkName = name -> name.length() > 5;
//		 list.forEach(name -> {
//		 if (checkName.test(name)) {
//		 System.out.println(name);
//		 }
//		 });

//		 list.sort((name1, name2) -> name1.compareTo(name2));
//		 list.forEach(name -> System.out.println(name));

//		 list.sort((name1, name2) -> name1.length() - name2.length());
//		 list.forEach(name -> System.out.println(name));
	}
}