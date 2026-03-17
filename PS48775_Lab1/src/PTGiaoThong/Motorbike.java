package PTGiaoThong;

public class Motorbike extends Vehicle {
	private double engineCapacity;

	public Motorbike(double engineCapacity) {
		this.setEngineCapacity(engineCapacity);
	}

	public Motorbike(String id, String brand, double basePrice, double engineCapacity) {
		super(id, brand, basePrice);
		this.setEngineCapacity(engineCapacity);
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public boolean setEngineCapacity(double engineCapacity) {
		if (engineCapacity > 0) {
			this.engineCapacity = engineCapacity;
			return true;
		} else {
			System.err.println("Lỗi: engineCapacity phải lớn hơn 0");
			return false;
		}
	}

	@Override
	public double calculateTax() {
		if (engineCapacity < 175) {
			return getBasePrice() * 0.05;
		} else {
			return getBasePrice() * 0.2;
		}
	}

	@Override
	public String toString() {
		return String.format("id = %s, brand = %s, basePrice = %.2f, engineCapacity = %.2f, totalPrice = %.2f", getId(), getBrand(), getBasePrice(), engineCapacity, totalPrice());
	}
}
