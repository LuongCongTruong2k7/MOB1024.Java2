package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connect.DBConnect;
import enity.Student;

public class StudentRepository {
	public List<Student> findAll() {
		List<Student> lsStudent = new ArrayList<>();
		try (Connection conn = DBConnect.getConnection()) {
			String mysql = "select * from student";
			PreparedStatement ps = conn.prepareStatement(mysql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student sv = new Student(
						rs.getInt("student_id"),
						rs.getString("student_name"),
						rs.getString("gender"),
						rs.getDouble("gpa"));
				lsStudent.add(sv);
			}
			return lsStudent;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public void showAll() {
		this.findAll().stream().forEach(System.out::println);
	}

	public Student findById(int Id) {
		try (Connection conn = DBConnect.getConnection()) {
			String sql = "select * from student where student_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, Id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
			 return new Student(
					rs.getInt("student_id"),
					rs.getString("student_name"),
					rs.getString("gender"),
					rs.getDouble("gpa"));
			}
			return null;
		} catch (SQLException e) {
			System.out.println("Lỗi CSDL: " + e.getMessage());
			return null;
		} catch (Exception e) {
			System.out.println("Lỗi khác: " + e.getMessage());
			return null;
		}
	}

	public boolean save(Student sv) {
		String mysql = "insert into student (student_name, gender, gpa) VALUES (?, ?, ?)";
		try (Connection conn = DBConnect.getConnection();
				PreparedStatement ps = conn.prepareStatement(mysql)) {

			ps.setString(1, sv.getStudent_name());
			ps.setString(2, sv.getGender());
			ps.setDouble(3, sv.getGpa());

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
		    if (e.getErrorCode() == 3819) {
		        System.out.println("Lỗi: Dữ liệu không hợp lệ (Ví dụ: GPA phải từ 0 đến 4.0).");
		    } else if (e.getErrorCode() == 1406) {
		        System.out.println("Lỗi: Dữ liệu nhập vào quá dài so với quy định.");
		    } else if (e.getErrorCode() == 1452) { 
		        System.out.println("Lỗi: Parent ID không tồn tại.");
		    } else {
		        System.out.println("Lỗi thao tác CSDL: " + e.getMessage());
		    }
		    return false;
		} catch (Exception e) {
			System.out.println("Lỗi khác: " + e.getMessage());
			return false;
		}
	}

	public boolean save(String student_name, String gender, Double gpa) {
		String mysql = "insert into student (student_name, gender, gpa) VALUES (?, ?, ?)";
		try (Connection conn = DBConnect.getConnection();
				PreparedStatement ps = conn.prepareStatement(mysql)) {

			ps.setString(1, student_name);
			ps.setString(2, gender);
			ps.setDouble(3, gpa);

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
		    if (e.getErrorCode() == 3819) {
		        System.out.println("Lỗi: Dữ liệu không hợp lệ (Ví dụ: GPA phải từ 0 đến 4.0).");
		    } else if (e.getErrorCode() == 1406) {
		        System.out.println("Lỗi: Dữ liệu nhập vào quá dài so với quy định.");
		    } else if (e.getErrorCode() == 1452) { 
		        System.out.println("Lỗi: Parent ID không tồn tại.");
		    } else {
		        System.out.println("Lỗi thao tác CSDL: " + e.getMessage());
		    }
		    return false;
		} catch (Exception e) {
			System.out.println("Lỗi khác: " + e.getMessage());
			return false;
		}
	}

	public boolean delete(int id) {
		String mysql = "delete from student where student_id = ?";
		try (Connection conn = DBConnect.getConnection();
				PreparedStatement ps = conn.prepareStatement(mysql)) {

			ps.setInt(1, id);
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
		    if (e.getErrorCode() == 3819) {
		        System.out.println("Lỗi: Dữ liệu không hợp lệ (Ví dụ: GPA phải từ 0 đến 4.0).");
		    } else if (e.getErrorCode() == 1406) {
		        System.out.println("Lỗi: Dữ liệu nhập vào quá dài so với quy định.");
		    } else if (e.getErrorCode() == 1452) { 
		        System.out.println("Lỗi: Parent ID không tồn tại.");
		    } else {
		        System.out.println("Lỗi thao tác CSDL: " + e.getMessage());
		    }
		    return false;
		} catch (Exception e) {
			System.out.println("Lỗi khác: " + e.getMessage());
			return false;
		}
	}

	public boolean update(Student sv) {
		String mysql = "update student set student_name =?, gender = ?, gpa = ? where student_id = ?";
		try (Connection conn = DBConnect.getConnection();
				PreparedStatement ps = conn.prepareStatement(mysql)) {

			ps.setString(1, sv.getStudent_name());
			ps.setString(2, sv.getGender());
			ps.setDouble(3, sv.getGpa());
			ps.setInt(4, sv.getStudent_id());

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
		    if (e.getErrorCode() == 3819) {
		        System.out.println("Lỗi: Dữ liệu không hợp lệ (Ví dụ: GPA phải từ 0 đến 4.0).");
		    } else if (e.getErrorCode() == 1406) {
		        System.out.println("Lỗi: Dữ liệu nhập vào quá dài so với quy định.");
		    } else if (e.getErrorCode() == 1452) { 
		        System.out.println("Lỗi: Parent ID không tồn tại.");
		    } else {
		        System.out.println("Lỗi thao tác CSDL: " + e.getMessage());
		    }
		    return false;
		} catch (Exception e) {
			System.out.println("Lỗi khác: " + e.getMessage());
			return false;
		}
	}
}
