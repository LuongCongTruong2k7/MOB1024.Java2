package Slide2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main_Map {
	public static void main(String[] args) {
		List<Student> lsStudents = new ArrayList<Student>();
		Map<String, Student> lsMap = new HashMap<>();
		
		lsMap.put("01", new Student("SV01", "Lương Công Trường", 9));
		lsMap.put("02", new Student("SV02", "Hello Kitty", 8));
		lsMap.put("03", new Student("SV03", "ManBo", 9));
		
		System.out.println(lsMap.get("01"));
		System.out.println(lsMap.get("02"));
	}
}
