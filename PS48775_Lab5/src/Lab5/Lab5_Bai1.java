package Lab5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab5_Bai1 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>(Arrays.asList("Tín", "Trường", "Duy", "Triết", "Minh Sang"));
		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("name.txt"));
//			for (String name : names) {
//				bw.write(name);
//				bw.newLine();
//			}
//			System.out.println("Đã ghi file thành công");
//			bw.close();
			
			BufferedReader br = new BufferedReader(new FileReader("name.txt"));
			String line;
			System.out.println("Các tên trong file name.txt:");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("Đã đọc file thành công");
			br.close();
		} catch (IOException e) {
			System.out.println("Lỗi: " + e.getMessage());
		}
	}
}
