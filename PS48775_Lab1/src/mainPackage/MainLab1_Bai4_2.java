package mainPackage;

import java.util.ArrayList;
import BatDongSan.*;

public class MainLab1_Bai4_2 {
    public static void main(String[] args) {
        ArrayList<Property> listProperty = new ArrayList<Property>();

        listProperty.add(new Apartment("AP01", "Ha Noi", 50, 2, 100000));
        listProperty.add(new Apartment("AP02", "Ha Noi", 100, 3, 200000));
        listProperty.add(new Villa("VL01", "Ha Noi", 50, true, 100000));
        listProperty.add(new Villa("VL02", "Ha Noi", 100, false, 200000));
        listProperty.add(new Property("PR01", "Ha Noi", 50));

        if (listProperty.isEmpty()) {
            System.out.println("Danh sách bất động sản đang trống.");
        } else {
            for (Property p : listProperty) {
                System.out.println(p.toString());
            }
            double totalArea = 0;
            for (Property p : listProperty) {
				totalArea += p.getArea();
			}
            System.out.println("Tổng diện tích của tất cả bất động sản: " + totalArea);
        }
    }
}
