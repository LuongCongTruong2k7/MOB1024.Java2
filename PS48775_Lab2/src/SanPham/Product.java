package SanPham;

import SanPham.EnumSanPham.ProductCategory;

public class Product {
	private String id;
	private String name;
	private double price;
	private ProductCategory category;
	
	public Product(String id, String name, double price, ProductCategory category) {  
	    this.setId(id);
	    this.setName(name);
	    this.setPrice(price);
	    this.category = category;
	}
	
	public String getId() {
		return id;
	}
	public boolean setId(String id) {
		if (id != "") {
			this.id = id;
			return true;
		}
		this.id = "Quên nhập id rồi Nàng";
		return false;
	}
	public String getName() {
		return name;
	}
	public boolean setName(String name) {
		if (name != "") {
			this.name = name;
			return true;
		} else {
			this.name = "Quên nhập tên rồi Nàng";
			return false;
		}
	}
	public double getPrice() {
		return price;
	}
	public boolean setPrice(double price) {
		if (price >= 0) {
			this.price = price;
			return true;
		} else {
			return false;
		}
	}
	public EnumSanPham.ProductCategory getCategory() {
		return category;
	}
	public void setCategory(EnumSanPham.ProductCategory category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
}
