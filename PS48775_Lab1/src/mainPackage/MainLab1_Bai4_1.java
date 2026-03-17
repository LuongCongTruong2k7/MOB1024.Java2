package mainPackage;

import java.util.ArrayList;
import PTGiaoThong.*;

public class MainLab1_Bai4_1 {
	public static void main(String[] args) {
		ArrayList<Vehicle> listCar = new ArrayList<Vehicle>();
		listCar.add(new Vehicle("Car1", "Toyota", 1000));
		listCar.add(new Vehicle("Car2", "Honda", 1500));
		listCar.add(new Vehicle("Car3", "Ford", 2000));
		listCar.add(new Motorbike("Moto1", "Yamaha", 6000, 150));
		listCar.add(new Motorbike("Moto2", "Kawasaki ", 7000000, 185));
		
		if (listCar.isEmpty()) {
			System.out.print("Không có phương tiện nào trong danh sách.");
		} else {
			System.out.println("Danh sách phương tiện:");
			for (Vehicle v : listCar) {
				System.out.println(v.toString());
			}
			Vehicle maxTaxVehicle = listCar.get(0);
			for (Vehicle v : listCar) {
				if (v.calculateTax() > maxTaxVehicle.calculateTax()) {
					maxTaxVehicle = v;
				}
			}
			System.out.println("Phương tiện có thuế cao nhất: " + maxTaxVehicle.toString());
		}
	}
}
