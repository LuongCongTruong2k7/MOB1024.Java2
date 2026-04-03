package MainPackage;

import java.util.ArrayList;
import java.util.function.Predicate;

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
		
		list.forEach(name -> System.out.println(name));
		
		 Predicate<String> checkName = name -> name.length() > 5;
		 list.forEach(name -> {
			 if (checkName.test(name)) {
				 System.out.println(name);
				 }
			 });

		 list.sort((name1, name2) -> name1.compareTo(name2));
		 list.forEach(name -> System.out.println(name));

		 list.sort((name1, name2) -> name1.length() - name2.length());
		 list.forEach(name -> System.out.println(name));
	}
}