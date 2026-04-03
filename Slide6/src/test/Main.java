package test;

import java.sql.*;

public class Main {
	private static final String URL = "jdbc:mysql://localhost:3306/demo_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "12345678";
	
	public static void main(String[] args) {
		System.out.println("ĐANG KHỞI TẠO KẾT NỐI...");
		try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users")) {
			
			System.out.println("Kết nối MySQL thành công");
			System.out.println("-----------------------------------------------------");
			System.out.printf("%-5s | %-20s | %-20s\n", "ID", "HỌ TÊN", "Email");
			System.out.println("-----------------------------------------------------");
			
			int count = 0;
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("fullname");
				String email = rs.getString("email");
				
				System.out.printf("%-5d | %-20s | %-20s\n", id, name, email);
				count++;
			}
			
			System.out.println("-----------------------------------------------------");
			System.out.println("Tổng số dòng lấy được: " + count);
			
		} catch (SQLException e) {
			System.out.println("Lỗi kết nối MySQL: " + e.getMessage());
			return;
		}
	}
}
