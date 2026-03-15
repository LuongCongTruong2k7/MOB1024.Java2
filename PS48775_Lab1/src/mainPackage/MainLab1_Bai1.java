package mainPackage;

import java.util.ArrayList;
import enity.*;


public class MainLab1_Bai1 {
	public static void main(String[] args) {
		ArrayList<Product> listProduct = new ArrayList<Product>();
		
		listProduct.add(new Product("P001", "Product 1", 100.0));
        listProduct.add(new Product("P003", "Product 3", 200.0));
        listProduct.add(new Product("", "Invalid Product", -50.0));
        listProduct.add(new ImportedProduct("I002", "Imported Product 2", 150.0, 0.1, 20.0));
        listProduct.add(new ImportedProduct("I004", "Imported Product 4", 250.0, 0.15, 30.0));

		for (Product p : listProduct) {
			System.out.println(p.toString());
		}

		Product max = listProduct.get(0);
		for (Product p : listProduct) { 
			if (p.finalPrice() > max.finalPrice()) { 
				max = p; 
			}
		}
		System.out.println("Sản phẩm có giá cao nhất: " + max.toString());
	}
}
