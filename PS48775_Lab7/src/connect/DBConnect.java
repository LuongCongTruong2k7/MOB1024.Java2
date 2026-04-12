package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import util.ExceptionLogging;

public class DBConnect {
	private static final String URL = "jdbc:mysql://localhost:3306/lab06_jdbc";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "12345678";
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch (SQLException e) {
		    logConnectionFailure(e);
		    return null;
		} catch (ClassNotFoundException e) {
		    System.out.println("Thiếu thư viện MySQL JDBC Driver.");
		    return null;
		} catch (Exception e) {
			 ExceptionLogging.batLoiHeThong(e);
			 return null;
		}
	}
	
	private static void logConnectionFailure(SQLException e) {
		int code = e.getErrorCode();
		String msg = e.getMessage() != null ? e.getMessage() : "";
		
		if (code == 1045) {
			System.err.println("MySQL từ chối đăng nhập (1045): sai User/Password hoặc user không có quyền");
		} else if (code == 1049) {
			System.err.println("Cơ sở dữ liệu không tồn tại (1049): kiểm tra tên database");
		} else if (code == 0 && msg.contains("Communications link failure")) {
			System.err.println("Không thể kết nối đến MySQL server: kiểm tra server đang chạy và URL");
		} else if (msg.contains("Unknown database")) {
			System.err.println("Cơ sở dữ liệu không tồn tại: kiểm tra tên database");
		} else {
			System.err.println("Lỗi kết nối MySQL: " + msg + " (Error code: " + code + ")");
		}
	}
}


