package Lab5;

import java.util.Arrays;
import java.util.List;

public class MainBai2 {
	public static void main(String[] args) {
		ModelFileService_Bai2 service = new ModelFileService_Bai2();
		
		List<Model_Bai2> students = Arrays.asList(
			new Model_Bai2("S001", "Tín", 3.5),
			new Model_Bai2("S002", "Trường", 3.8),
			new Model_Bai2("S003", "Hải", 3.2)
		);
		
		service.saveToFile(students);
		
		List<Model_Bai2> readList = service.readFromFile();
		readList.forEach(System.out::println);
	}
}
