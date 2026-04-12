package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	private static final String URL = "jdbc:mysql://localhost:3306/lab06_jdbc";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "12345678";
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch (SQLException e) {
		    System.out.println("Không thể kết nối đến cơ sở dữ liệu. Hãy kiểm tra URL, Username, Password hoặc xem MySQL đã bật chưa.");
		} catch (ClassNotFoundException e) {
		    System.out.println("Thiếu thư viện MySQL JDBC Driver.");
		} catch (Exception e) {
		    System.out.println("Lỗi không xác định: " + e.getMessage());
		    
		}
		return null;
	}
}
