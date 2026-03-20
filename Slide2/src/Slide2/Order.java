package Slide2;

import Slide2.Enum.OrderStatus;

public class Order {
	int id;
	String customerName;
	OrderStatus status;
	
	public Order(int id, String customerName, OrderStatus status) {
		this.id = id;
		this.customerName = customerName;
		this.status = status;
	}
	
	public void CheckStatus() {
		switch (this.status) {
		case NEW: 
			System.out.println("Đơn hàng mới được tạo.");
			break;
		case PROCESSING:
			System.out.println("Đơn hàng đang được xử lý.");
			break;
		case COMPLETED:
			System.out.println("Đơn hàng đã hoàn thành.");
			break;
		case CANCELED:
			System.out.println("Đơn hàng đã bị hủy.");
			break;
		}
	}

	@Override
	public String toString() {
		return "Order [Mã đơn =" + id + ", Tên Khách Hàng=" + customerName + ", Trạng Thái=" + status + "]";
	}
}
