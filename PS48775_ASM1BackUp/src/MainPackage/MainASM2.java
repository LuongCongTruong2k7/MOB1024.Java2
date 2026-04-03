package MainPackage;

import java.util.Scanner;
import BasicManagement.*;

public class MainASM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DocumentService docService = new DocumentService();
        GenericManager<Document> docManager = docService.getDocManager();
        int choice = -1;
        do {
            try {
                System.out.println("1. Thêm tài liệu");
                System.out.println("2. Thêm bản sao từ tài liệu");
                System.out.println("3. Sửa tài liệu & bản sao");
                System.out.println("4. Xóa tài liệu & bản sao ");
                System.out.println("5. Xem danh sách tài liệu & bản sao");
                System.out.println("6. Lưu file");
                System.out.println("7. Đọc file");
                System.out.println("0. Thoát");
                System.out.print("Chọn chức năng: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Nhập mã tài liệu: ");
                        String ma = sc.nextLine();
                        System.out.print("Nhập tên tài liệu: ");
                        String ten = sc.nextLine();
                        Document newDoc = new Document(ma, ten);
                        docManager.them(ma, newDoc);
                        System.out.println("Thêm tài liệu thành công");
                        break;
                    case 2:
                        System.out.print("Nhập mã tài liệu muốn thêm bản sao: ");
                        String maTaiLieuTim = sc.nextLine();
                        Document docFound = docManager.layDuLieu(maTaiLieuTim);
                        if (docFound == null) {
                            System.out.println("Không tìm thấy tài liệu này");
                            break;
                        }
                        System.out.print("Nhập mã bản sao: ");
                        String maBS = sc.nextLine();
                        System.out.print("Chọn trạng thái (1. Còn tốt, 2. Hư hỏng, 3. Mất): ");
                        int chonTT = sc.nextInt();
                        sc.nextLine();
                        TrangThai tt = TrangThai.CON_TOT;
                        switch (chonTT) {
                            case 1:
                                tt = TrangThai.CON_TOT;
                                break;
                            case 2:
                                tt = TrangThai.HU_HONG;
                                break;
                            case 3:
                                tt = TrangThai.MAT;
                                break;
                        }
                        Copy newCopy = new Copy(maBS, tt);
                        docFound.themBanSao(newCopy);
                        System.out.println("Thêm bản sao thành công");
                        break;
                    case 3:
                        // dùng switch
                        // dùng try catch
                        // dùng lambda
                        
                    case 4:
                        System.out.println("Bạn muốn xóa gì?");
                        System.out.println("1. Xóa Tài liệu");
                        System.out.println("2. Xóa Bản sao của Tài liệu");
                        System.out.print("Chọn: ");
                        int chonXoa = sc.nextInt();
                        sc.nextLine();

                        if (chonXoa == 1) {
                            System.out.print("Nhập mã tài liệu cần xóa: ");
                            String maXoa = sc.nextLine();
                            docManager.xoa(maXoa);
                            System.out.println("Xóa tài liệu thành công!");
                        } else if (chonXoa == 2) {
                            System.out.print("Nhập mã tài liệu chứa bản sao: ");
                            String maDocXoaBS = sc.nextLine();
                            Document docXoaBS = docManager.layDuLieu(maDocXoaBS);

                            if (docXoaBS != null) {
                                System.out.print("Nhập mã bản sao cần xóa: ");
                                String maBSXoa = sc.nextLine();
                                Copy copyCanXoa = docXoaBS.getListBanSao().get(maBSXoa.toLowerCase());

                                if (copyCanXoa != null) {
                                    docXoaBS.xoaBanSao(copyCanXoa);
                                    System.out.println("Xóa bản sao thành công");
                                } else {
                                    System.out.println("Không tìm thấy bản sao mã: " + maBSXoa);
                                }
                            } else {
                                System.out.println("Không tìm thấy tài liệu mã: " + maDocXoaBS);
                            }
                        } else {
                            System.out.println("Lựa chọn không hợp lệ!");
                        }
                        break;
                    case 5:
                        docManager.hienThi();
                        break;
                    case 6:
                        docService.luuFile();
                        break;
                    case 7:
                        docService.docFile();
                        break;
                    case 0:
                        System.out.println("Tạm biệt");
                        break;
                    default:
                        System.out.println("Vui lòng chọn chức năng có trong hệ thống");
                }
            } catch (DuplicateIdException e) {
                System.out.println("Lỗi: " + e.getMessage());
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                sc.nextLine();
            }
        } while (choice != 0);
    }
}
