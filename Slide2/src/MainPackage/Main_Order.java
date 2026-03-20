package MainPackage;

import Slide2.Order;
import Slide2.Enum.OrderStatus;

public class Main_Order {
	public static void main(String[] args) {
		Order o = new Order(1, "John Doe", OrderStatus.NEW);
		o.CheckStatus();
		System.out.println(o.toString());
	}
}
