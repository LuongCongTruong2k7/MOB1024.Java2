package slide5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class slide5 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("Anh phùng thanh nộ.txt");
			fw.write(
					"Na na na na Phùng Thanh Độ.. Thanh Độ Mixi Phùng Thanh Độ, anh Độ Mixi Cảm ơn anh, anh Độ Mixi Phùng Thanh Độ, anh Độ Mixi Yeah! Yeah! Anh Độ Mixi! Anh Độ Mixi Anh Độ Mixi Anh Độ Mixi Anh tên là Anh Độ Anh Độ Mixi Na na Mami Cảm ơn anh Vi đã mang lại tiếng cười Cho bọn em hàng ngày Cảm ơn anh Vì những buổi stream Êm đềm em đi chơi Mời em đi quẩy khắp nơi Nhưng mà em vẫn cứ thích Anh Độ Mixi Yeah! Yeah! Mixi! Anh Đô Mixi Anh tên là Thanh Đô Mình gọi là Anh Độ Mixi Anh tên là Thanh Độ Mình gọi là Anh Độ Mixi");
			fw.close();
			System.out.println("Ghi file thành công!");
		} catch (IOException e) {
			System.out.println("Lỗi khi ghi file: " + e.getMessage());
		}
		// try {
		// FileReader fr = new FileReader("Anh phùng thanh nộ.txt");
		// int ch;
		// while ((ch = fr.read()) != -1) {
		// System.out.print((char) ch);
		// }
		// fr.close();
		// } catch (Exception e) {
		// System.out.println("Lỗi khi đọc file: " + e.getMessage());
		// }
	}
}