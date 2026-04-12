package main;

import java.util.List;
import java.util.Scanner;

import enity.NodeChildCountDTO;
import enity.Student;
import enity.Tree;
import repository.StudentRepository;
import repository.TreeRepository;

public class MainLab6 {
	public static void dungManHinh(Scanner sc) {
		System.out.print("Bam phim Enter de tiep tuc");
		sc.nextLine();
	}

	public static void xoaManHinh() {
		for (int i = 0; i < 30; i++) {
			System.out.println();
		}
	}

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		StudentRepository studentRepo = new StudentRepository();
		TreeRepository treeRepo = new TreeRepository();

		while (true) {
			try {
				xoaManHinh();
				System.out.println("1. liet ke danh sach");
				System.out.println("2. them");
				System.out.println("3. cap nhat");
				System.out.println("4. xoa");
				System.out.println("5. tim kiem theo id");
				System.out.println("6. dem so con moi node");
				System.out.println("0. thoat");
				System.out.print("Chon chuc nang: ");
				int choice = Integer.parseInt(sc.nextLine());
				int subChoice = 0;
				switch (choice) {
					case 1:
						System.out.print("1. Student | 2. Tree - chon doi tuong: ");
						subChoice = Integer.parseInt(sc.nextLine());
						switch (subChoice) {
							case 1:
								studentRepo.showAll();
								break;
							case 2:
								treeRepo.showAll();
								break;
							default:
								System.out.println("khong co anh chang nay");
						}
						break;
					case 2:
						System.out.print("1. Student | 2. Tree - chon doi tuong: ");
						subChoice = Integer.parseInt(sc.nextLine());
						switch (subChoice) {
							case 1:
								System.out.print("nhap ten sv: ");
								String name = sc.nextLine();
								System.out.print("nhap gioi tinh: ");
								String gender = sc.nextLine();
								System.out.print("nhap diem GPA: ");
								double gpa = Double.parseDouble(sc.nextLine());

								studentRepo.save(name, gender, gpa);
								System.out.println("them thanh cong sv " + name);
								break;
							case 2:
								System.out.print("nhap ten node: ");
								String nodeName = sc.nextLine();
								System.out.print("nhap parent id: ");
								int parentId = Integer.parseInt(sc.nextLine());
								System.out.print("nhap level: ");
								int level = Integer.parseInt(sc.nextLine());

								treeRepo.save(nodeName, parentId, level);
								System.out.println("them thanh cong node " + nodeName);
								break;
							default:
								System.out.println("khong co anh chang nay");
						}
						break;
					case 3:
						System.out.print("1. Student | 2. Tree - chon doi tuong: ");
						subChoice = Integer.parseInt(sc.nextLine());
						switch (subChoice) {
							case 1:
								System.out.print("nhap id: ");
								int id = Integer.parseInt(sc.nextLine());
								System.out.print("nhap ten sv moi: ");
								String newName = sc.nextLine();
								System.out.print("nhap gioi tinh sv moi: ");
								String newGender = sc.nextLine();
								System.out.print("nhap diem gpa sv moi: ");
								double newGpa = Double.parseDouble(sc.nextLine());

								studentRepo.update(new Student(id, newName, newGender, newGpa));
								System.out.println("cap nhat thanh cong sv " + id);
								break;
							case 2:
								System.out.print("nhap id node: ");
								int nodeId = Integer.parseInt(sc.nextLine());
								System.out.print("nhap ten node moi: ");
								String newNodeName = sc.nextLine();
								System.out.print("nhap parent id moi: ");
								int newParentId = Integer.parseInt(sc.nextLine());
								System.out.print("nhap level moi: ");
								int newLevel = Integer.parseInt(sc.nextLine());

								treeRepo.update(new Tree(nodeId, newNodeName, newParentId, newLevel));
								System.out.println("cap nhat thanh cong node " + nodeId);
								break;
							default:
								System.out.println("khong co anh chang nay");
						}
						break;
					case 4:
						System.out.print("1. Student | 2. Tree - chon doi tuong: ");
						subChoice = Integer.parseInt(sc.nextLine());
						switch (subChoice) {
							case 1:
								System.out.print("nhap id sv can xoa: ");
								int deleteId = Integer.parseInt(sc.nextLine());
								studentRepo.delete(deleteId);
								System.out.println("xoa thanh cong sv " + deleteId);
								break;
							case 2:
								System.out.print("nhap id node can xoa: ");
								int deleteNodeId = Integer.parseInt(sc.nextLine());
								treeRepo.delete(deleteNodeId);
								System.out.println("xoa thanh cong node " + deleteNodeId);
								break;
							default:
								System.out.println("khong co anh chang nay");
						}
						break;
					case 5:
						System.out.print("1. Student | 2. Tree - chon doi tuong: ");
						subChoice = Integer.parseInt(sc.nextLine());
						switch (subChoice) {
							case 1:
								System.out.print("Nhập id can tim: ");
								int searchId = Integer.parseInt(sc.nextLine());
								Student sv = studentRepo.findById(searchId);
								if (sv != null) {
									System.out.println(sv);
								} else {
									System.out.println("khong tim thay sv co id " + searchId);
								}
								break;
							case 2:
								System.out.print("Nhập id node can tim: ");
								int searchNodeId = Integer.parseInt(sc.nextLine());
								Tree node = treeRepo.findById(searchNodeId);
								if (node != null) {
									System.out.println(node);
								} else {
									System.out.println("khong tim thay node co id " + searchNodeId);
								}
								break;
							default:
								System.out.println("khong co anh chang nay");
						}
						break;
					case 6:
						List<NodeChildCountDTO> result = treeRepo.countChildrenPerNode();

						result.forEach(item -> System.out.println("Node ID: " + item.getNode_id() +
								" | Name: " + item.getNode_name() +
								" | Số con: " + item.getChild_count()));
						break;
					case 0:
						System.out.println("tam biet");
						return;
					default:
						System.out.println("khong co chuc nang nay");
				}
				dungManHinh(sc);
			} catch (NumberFormatException e) {
				System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ");
				dungManHinh(sc);
			} catch (Exception e) {
				System.out.println("Đã xảy ra lỗi: " + e.getMessage());
				dungManHinh(sc);
			}
		}
	}
}