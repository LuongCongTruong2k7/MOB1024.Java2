package enity;

public class Product {
	private String id;
	private String name;
	private double basePrice;
	
	public Product() {
	}

	public Product(String id, String name, double basePrice) {
		this.setId(id);
		this.name = name;
		this.setBasePrice(basePrice);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id != "") {
			this.id = id;
		} else {
			this.id = "Unknown";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		if (basePrice >= 0) {
			this.basePrice = basePrice;
		}	else {
			this.basePrice = 0;
		}
	}

	public double finalPrice() {
		return this.basePrice;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", basePrice=" + basePrice + ", finalPrice =" + finalPrice() + "]";
	}
}
