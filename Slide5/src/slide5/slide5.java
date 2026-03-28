package slide5;

import java.io.FileReader;

public class slide5 {
	public static void main(String[] args) {
		// try {
		// FileWriter fw = new FileWriter("output1.txt");
		// fw.write("Hello, World!");
		// fw.close();
		// System.out.println("Ghi file thành công!");
		// } catch (Exception e) {
		// System.out.println("Lỗi khi ghi file: " + e.getMessage());
		// }
		try {
			FileReader fr = new FileReader("output1.txt");
			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println("Lỗi khi đọc file: " + e.getMessage());
		}
	}
}