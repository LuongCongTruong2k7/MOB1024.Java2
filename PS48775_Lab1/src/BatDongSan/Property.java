package BatDongSan;

public class Property {
	private String id;
	private String address;
	private double area;

	public Property() {
	}

	public Property(String id, String address, double area) {
		this.setId(id);
		this.address = address;
		this.setArea(area);
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getArea() {
		return area;
	}

	public boolean setArea(double area) {
		if (area > 0) {
			this.area = area;
			return true;
		} else {
			System.err.println("Lỗi: area phải lớn hơn 0");
			return false;
		}
	}

	public double rentalValue() {
		return area * 100000;
	}

	@Override
	public String toString() {
		return String.format("id = %s, address = %s, area = %.2f, rentalValue = %.2f", id, address, area, rentalValue());
	}
}
