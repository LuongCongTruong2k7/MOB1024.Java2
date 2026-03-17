package BatDongSan;

public class Apartment extends Property {
	private int floor;
	private double managementFee;

	public Apartment(String id, String address, double area, int floor, double managementFee) {
		super(id, address, area);
		this.floor = floor;
		this.managementFee = managementFee;
	}

	public double getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public double getManagementFee() {
		return managementFee;
	}

	public void setManagementFee(double managementFee) {
		this.managementFee = managementFee;
	}

	@Override
	public double rentalValue() {
		return this.getArea() * 100000 + this.managementFee;
	}

	@Override
	public String toString() {
		return String.format("id = %s, address = %s, area = %.2f, floor = %d, managementFee = %.2f, rentalValue = %.2f", this.getId(), this.getAddress(), this.getArea(), floor, managementFee, rentalValue());
	}
}
