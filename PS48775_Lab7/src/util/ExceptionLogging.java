package util;

public class ExceptionLogging {
    public static void batLoiHeThong(Exception e) {
        String tenLoi = e.getClass().getSimpleName();
        
        System.err.println("=== ⚠️ PHÁT HIỆN LỖI HỆ THỐNG JAVA ===");
        
        switch (tenLoi) {
            case "NullPointerException":
                System.err.println("Lỗi [NullPointer]: Đang thao tác với một đối tượng chưa tồn tại (bị null).");
                break;
                
            case "ArithmeticException":
                System.err.println("Lỗi [Toán học]: Xảy ra lỗi tính toán phi logic.");
                break;
                
            case "IllegalArgumentException":
                System.err.println("Lỗi [Tham số không hợp lệ]: Dữ liệu truyền vào hàm bị sai logic.");
                break;
                
            case "IndexOutOfBoundsException":
                System.err.println("Lỗi [Tràn viền]: Đang cố truy cập vào phần tử không tồn tại trong List/Array.");
                break;
                
            case "NumberFormatException":
                System.err.println("Lỗi [Ép kiểu số]: Đang cố biến một chuỗi chữ thành số thất bại.");
                break;
                
            default:
                System.err.println("Lỗi không xác định [Loại lỗi: " + tenLoi + "]");
                System.err.println("Chi tiết (Message): " + e.getMessage());
                break;
        }
        
        System.err.println("--- Dấu vết (Stack Trace) ---");
        e.printStackTrace(); 
        System.err.println("=======================================");
    }
}
