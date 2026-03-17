package PTGiaoThong;

public class Vehicle {
	private String id;
	private String brand;
	private double basePrice;

	public Vehicle() {
	}

	public Vehicle(String id, String brand, double basePrice) {
		this.setId(id);
		this.brand = brand;
		this.setBasePrice(basePrice);
	}

	public String getId() {
		return id;
	}

	public boolean setId(String id) {
		if (id != "") {
			this.id = id;
			return true;
		} else {
			System.err.println("Lỗi: id không được để trống");
			return false;
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public boolean setBasePrice(double basePrice) {
		if (basePrice > 0) {
			this.basePrice = basePrice;
			return true;
		} else {
			System.err.println("Lỗi: basePrice phải lớn hơn 0");
			return false;
		}
	}

	public double calculateTax() {
		return basePrice * 0.1;
	}

	public double totalPrice() {
		return basePrice + calculateTax();
	}

	@Override
	public String toString() {
		return String.format("id = %s, brand = %s, basePrice = %.2f, totalPrice = %.2f", id, brand, basePrice, totalPrice());
	}
}
