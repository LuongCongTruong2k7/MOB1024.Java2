package mainPackage;

import SanPham.*;
import java.util.ArrayList;

public class MainLab1_Bai1 {
	public static void main(String[] args) {
		ArrayList<Product> listProduct = new ArrayList<Product>();

		listProduct.add(new Product("P01", "Bàn phím cơ", 120));
		listProduct.add(new ImportedProduct("IP01", "Chuột Logitech", 80, 0.1, 50));
		listProduct.add(new Product("", "Sản phẩm lỗi", -50000));
		listProduct.add(new ImportedProduct("IP02", "Tai nghe Sony", 2000, 1.5, -100));
		listProduct.add(new ImportedProduct("IP03", "Laptop Gaming", 3000, 0.1, 2000));

		if (listProduct.isEmpty()) {
		    System.out.println("Danh sách sản phẩm đang trống.");
		} else {
		    Product max = listProduct.get(0);
		    for (Product p : listProduct) {
		        if (p.finalPrice() > max.finalPrice()) {
		            max = p;
		        }
		    }
		    System.out.println("Danh sách sản phẩm:");
		    for (Product p : listProduct) {
		        System.out.println(p.toString());
		    }
		    System.out.println("Sản phẩm có giá cao nhất: " + max.toString());
		}
	}
}
