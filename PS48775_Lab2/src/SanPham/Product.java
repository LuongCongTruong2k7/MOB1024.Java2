package SanPham;

import SanPham.EnumSanPham.ProductCategory;

public class Product {
	String id;
	String name;
	double price;
	ProductCategory category;
	
	public Product(String id, String name, double price, ProductCategory category) {
	    if (price < 0) throw new IllegalArgumentException("Giá sản phẩm không thể âm");
	    if (category == null) throw new IllegalArgumentException("Danh mục không được để trống");
	    
	    this.id = id;
	    this.name = name;
	    this.price = price;
	    this.category = category;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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
