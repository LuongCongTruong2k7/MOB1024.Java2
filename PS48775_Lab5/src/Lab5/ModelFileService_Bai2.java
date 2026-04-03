package Lab5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ModelFileService_Bai2 {
	private static final String FILE_NAME = "students.dat";
	
	public void saveToFile(List<Model_Bai2> students) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
			oos.writeObject(students);
			System.out.println("Lưu file thành công");
			oos.close();
		} catch (IOException e) {
			System.out.println("Lỗi khi lưu file: " + e.getMessage());
		}
	}
	
	
	public List<Model_Bai2> readFromFile() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
			System.out.println("Đọc file thành công");
			return (List<Model_Bai2>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Lỗi khi đọc file: " + e.getMessage());
		}
		return new ArrayList<>();
	}
}
