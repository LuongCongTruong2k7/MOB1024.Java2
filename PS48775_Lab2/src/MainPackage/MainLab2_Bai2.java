package MainPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import SanPham.*;
import SanPham.EnumSanPham.ProductCategory;


public class MainLab2_Bai2 {
	public static void main(String[] args) {
		List<Product> listProducts = new ArrayList<Product>();
		Map<ProductCategory, Integer> countProduct = new HashMap<>();
		Map<ProductCategory, Double> totalPrice = new HashMap<>();
		listProducts.add(new Product("P001", "MacBook Pro M3", 2500.0, ProductCategory.ELECTRONIC));
		listProducts.add(new Product("P002", "iPhone 15 Pro", 1100.0, ProductCategory.ELECTRONIC));
		listProducts.add(new Product("P003", "Áo sơ mi Oxford", 45.0, ProductCategory.CLOTHING));
		listProducts.add(new Product("P004", "Quần Jean Levi's", 75.0, ProductCategory.CLOTHING));
		listProducts.add(new Product("P005", "Bánh Mì Hoa Cúc", 5.5, ProductCategory.FOOD));
		listProducts.add(new Product("P006", "Sữa tươi tiệt trùng", 1.2, ProductCategory.FOOD));
		listProducts.add(new Product("P007", "Giày Sneaker Nike", 120.0, ProductCategory.CLOTHING));
		listProducts.add(new Product("P008", "Tai nghe Sony", 350.00, ProductCategory.ELECTRONIC));
		listProducts.add(new Product("P009", "Sản phẩm lỗi giá", -100.0, ProductCategory.ELECTRONIC));
		listProducts.add(new Product("P010", "Sữa hết hạn", 0.0, null));
		
		for (Product p : listProducts) {
			System.out.println(p.toString());
		}
		
		for (Product p : listProducts) {
			ProductCategory pc = p.getCategory();
			countProduct.put(pc, countProduct.getOrDefault(pc, 0) + 1);
			totalPrice.put(pc, totalPrice.getOrDefault(pc, 0.0) + p.getPrice());
		}
		for (Map.Entry<ProductCategory, Integer> entry : countProduct.entrySet()) {
			System.out.println("Loại: " + entry.getKey() + ", Số Lượng " + entry.getValue() 
			+ ", Tổng giá loại " + totalPrice.get(entry.getKey()));
		}
	}
}
