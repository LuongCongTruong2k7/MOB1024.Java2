package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connect.DBConnect;
import enity.Tree;
import enity.NodeChildCountDTO;

public class TreeRepository {
	public List<Tree> findAll() {
		List<Tree> lsTree = new ArrayList<>();
		try (Connection conn = DBConnect.getConnection()) {
			String mysql = "select * from tree";
			PreparedStatement ps = conn.prepareStatement(mysql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Tree tree = new Tree(
						rs.getInt("node_id"),
						rs.getString("node_name"),
						rs.getInt("parent_id"),
						rs.getInt("level"));
				lsTree.add(tree);
			}
			return lsTree;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public void showAll() {
		this.findAll().stream().forEach(System.out::println);
	}

	public Tree findById(int Id) {
		try (Connection conn = DBConnect.getConnection()) {
			String sql = "select * from tree where node_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, Id);
			ResultSet rs = ps.executeQuery();
			rs.next();
			Tree tree = new Tree(
					rs.getInt("node_id"),
					rs.getString("node_name"),
					rs.getInt("parent_id"),
					rs.getInt("level"));
			return tree;
		} catch (SQLException e) {
			System.out.println("Lỗi CSDL: " + e.getMessage());
			return null;
		} catch (Exception e) {
			System.out.println("Lỗi khác: " + e.getMessage());
			return null;
		}
	}

	public boolean save(Tree sv) {
		String mysql = "insert into tree (node_name, parent_id, level) VALUES (?, ?, ?)";
		try (Connection conn = DBConnect.getConnection();
				PreparedStatement ps = conn.prepareStatement(mysql)) {

			ps.setString(1, sv.getNode_name());
			ps.setInt(2, sv.getParent_id());
			ps.setInt(3, sv.getLevel());

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

	public boolean save(String node_name, int parent_id, int level) {
		String mysql = "insert into tree (node_name, parent_id, level) VALUES (?, ?, ?)";
		try (Connection conn = DBConnect.getConnection();
				PreparedStatement ps = conn.prepareStatement(mysql)) {

			ps.setString(1, node_name);
			ps.setInt(2, parent_id);
			ps.setInt(3, level);

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
		String mysql = "delete from tree where node_id = ?";
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

	public boolean update(Tree sv) {
		String mysql = "update tree set node_name = ?, parent_id = ?, level = ? where node_id = ?";
		try (Connection conn = DBConnect.getConnection();
				PreparedStatement ps = conn.prepareStatement(mysql)) {

			ps.setString(1, sv.getNode_name());
			ps.setInt(2, sv.getParent_id());
			ps.setInt(3, sv.getLevel());
			ps.setInt(4, sv.getNode_id());

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

	public List<NodeChildCountDTO> countChildrenPerNode() {
	    List<NodeChildCountDTO> listResult = new ArrayList<>();
	    String sql = "SELECT t1.node_id, t1.node_name, COUNT(t2.node_id) AS child_count "
	               + "FROM tree t1 "
	               + "LEFT JOIN tree t2 ON t1.node_id = t2.parent_id "
	               + "GROUP BY t1.node_id, t1.node_name";
	    try (Connection conn = DBConnect.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ResultSet rs = ps.executeQuery()) {

	        while (rs.next()) {
	            NodeChildCountDTO dto = new NodeChildCountDTO(
	                rs.getInt("node_id"),
	                rs.getString("node_name"),
	                rs.getInt("child_count")
	            );
	            listResult.add(dto);
	        }
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
	    } catch (Exception e) {
	        System.out.println("Lỗi khác: " + e.getMessage());
	    }
	    return listResult;
	}
}
