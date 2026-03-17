package Slide11;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Animal> dspet = new ArrayList<Animal>();
		dspet.add(new Cat("Mèo Mun", 2));
		dspet.add(new Dog("Chó Vàng", 3));
		for (Animal pet : dspet) {
			pet.eat();
			pet.sleep();
			pet.sound();
		}
	} 
}
