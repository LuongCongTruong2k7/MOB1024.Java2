package Slide2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, String> students = new HashMap<>();
		
		// Thêm dữ liệu (key - value)
		students.put("SV001", "Trường");
		students.put("SV002", "Thầy Mười");
		students.put("SV003", "Thầy Bảy");
		
		// Lấy dữ liệu theo key
		System.out.println(students.get("SV02"));
	}
}
