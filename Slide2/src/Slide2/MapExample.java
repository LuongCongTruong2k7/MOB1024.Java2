package Slide2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> bangGia = new HashMap<>();
		
		bangGia.put("iPhone 14 Pro Max", 300000);
		bangGia.put("Samsung Galaxy S23 Ultra", 25000000);
		bangGia.put("Google Pixel 7 Pro", 20000000);
		bangGia.put("iPhone 14 Pro Max", 32000000);
		System.out.println(bangGia);
		
		
//		System.out.println(bangGia.get("iPhone 14 Pro Max"));
//		System.out.println(bangGia.values());
//		for (String ds : bangGia.keySet()) {
//			System.out.println(ds + "-" + bangGia.get(ds)); 
//		}
//		System.out.println(bangGia.containsKey("iPhone 14 Pro Max"));
//		System.out.println(bangGia.containsValue(30000000));
	}
} 
