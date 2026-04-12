package repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import connect.DBConnect;
import entity.Employee;
import util.ExceptionLogging;

public class EmployeeRepository {
	public List<Employee> findAll() {
		List<Employee> lsEmp = new ArrayList<>();
		Connection connection = DBConnect.getConnection();
		if (connection == null) {
			return Collections.emptyList();
		}
		String mysql = "select * from employee";
		try (connection;
				PreparedStatement ps = connection.prepareStatement(mysql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				lsEmp.add(new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary")));
			}
			return lsEmp;
		} catch (SQLException e) {
			tatcaloicuthe(e);
			return Collections.emptyList();
		} catch (Exception e) {
			ExceptionLogging.batLoiHeThong(e);
			return Collections.emptyList();
		}
	}
	
	public boolean addEmployee(Employee emp) {
		Connection connection = DBConnect.getConnection();
		if (connection == null) {
			return false;
		}
		String mysql = "insert into employee values(?, ?, ?)";
		try (connection;
				PreparedStatement ps = connection.prepareStatement(mysql)) {
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			tatcaloicuthe(e);
			return false;
		} catch (Exception e) {
			ExceptionLogging.batLoiHeThong(e);
			return false;
		}
	}
	
	public boolean updateEmployee(Employee emp) {
		Connection connection = DBConnect.getConnection();
		if (connection == null) {
			return false;
		}
		String mysql = "update employee set name = ?, salary = ? where id = ?";
		try (connection;
				PreparedStatement ps = connection.prepareStatement(mysql)) {
			ps.setString(1, emp.getName());
			ps.setDouble(2, emp.getSalary());
			ps.setInt(3, emp.getId());
			int rows = ps.executeUpdate();
			if (rows == 0) {
				System.err.println("Cập nhật: không có dòng nào khớp id=" + emp.getId() + " (id không tồn tại)");
				return false;
			}
			return true;
		} catch (SQLException e) {
			tatcaloicuthe(e);
			return false;
		} catch (Exception e) {
			ExceptionLogging.batLoiHeThong(e);
			return false;
		}
	}
	
	public boolean deleteEmployee(int id) {
		Connection connection = DBConnect.getConnection();
		if (connection == null) {
			return false;
		}
		String mysql = "delete from employee where id = ?";
		try (connection;
				PreparedStatement ps = connection.prepareStatement(mysql)) {
			ps.setInt(1, id);
			int rows = ps.executeUpdate();
			if (rows == 0) {
				System.err.println("Xóa: không có dòng nào khớp id=" + id + " (id không tồn tại)");
				return false;
			}
			return true;
		} catch (SQLException e) {
			tatcaloicuthe(e);
			return false;
		} catch (Exception e) {
			ExceptionLogging.batLoiHeThong(e);
			return false;
		}
	}
	
	public Employee findById(int id) {
		Connection connection = DBConnect.getConnection();
		if (connection == null) {
			return null;
		}
		String callmysql = "{call sp_getEmployeeByID(?)}";
		try (connection;
				CallableStatement cs = connection.prepareCall(callmysql)) {
			cs.setInt(1, id);
			try (ResultSet rs = cs.executeQuery()) {
				if (rs.next()) {
					return new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary"));
				}
			}
			return null;
		} catch (SQLException e) {
			tatcaloicuthe(e);
			return null;
		} catch (Exception e) {
			ExceptionLogging.batLoiHeThong(e);
			return null;
		}
	}
	
	private static void tatcaloicuthe(SQLException e) {
		int errorCode = e.getErrorCode();
		System.err.println("=== CHI TIẾT LỖI MYSQL ===");

		switch (errorCode) {
			// 1. NHÓM LỖI CÚ PHÁP & ĐỐI TƯỢNG (Syntax & Objects)
			case 1146:
				System.err.println("Lỗi [1146]: Không tìm thấy bảng (Table doesn't exist). Bảng 'employee' hoặc 'emp' không có trong Database.");
				break;
			case 1054:
				System.err.println("Lỗi [1054]: Không tìm thấy cột (Unknown column). Tên cột id, name, hoặc salary bị sai chính tả.");
				break;
			case 1305:
				System.err.println("Lỗi [1305]: Không tìm thấy Procedure (Procedure does not exist). Thủ tục 'sp_getEmployeeByID' chưa được tạo trong CSDL.");
				break;
			case 1064:
				System.err.println("Lỗi [1064]: Sai cú pháp SQL (SQL syntax error). Dư hoặc thiếu dấu phẩy, nháy đơn, ngoặc...");
				break;

			// 2. NHÓM LỖI RÀNG BUỘC DỮ LIỆU (Constraints)
			case 1062:
				System.err.println("Lỗi [1062]: Trùng khóa chính (Duplicate entry). ID nhân viên này đã tồn tại (Lỗi ở hàm add).");
				break;
			case 1452:
				System.err.println("Lỗi [1452]: Vi phạm khóa ngoại (Foreign key constraint). ID đang thao tác có liên kết chặt chẽ với bảng khác.");
				break;
			case 1048:
				System.err.println("Lỗi [1048]: Vi phạm Not Null (Column cannot be null). Đang cố lưu giá trị rỗng vào cột bắt buộc.");
				break;

			// 3. NHÓM LỖI DỮ LIỆU ĐẦU VÀO (Data truncation/types)
			case 1406:
				System.err.println("Lỗi [1406]: Dữ liệu quá dài (Data too long). Tên nhân viên vượt quá số ký tự cho phép của cột.");
				break;
			case 1366:
				System.err.println("Lỗi [1366]: Sai kiểu dữ liệu (Incorrect string/integer value). Truyền kiểu chữ vào cột số hoặc ngược lại.");
				break;

			// 4. NHÓM LỖI ĐƯỜNG TRUYỀN & KẾT NỐI
			case 0:
				System.err.println("Lỗi [0]: Mất kết nối DB hoặc lỗi từ driver JDBC (Timeout, máy chủ sập, sai tham số '?'...).");
				break;

			// 5. CÁC LỖI KHÁC
			default:
				System.err.println("Lỗi không xác định [Mã lỗi: " + errorCode + "] - Trạng thái (SQLState): " + e.getSQLState());
				System.err.println("Chi tiết: " + e.getMessage());
				break;
		}
		System.err.println("==========================");
	}
}
