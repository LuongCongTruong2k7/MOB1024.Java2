package Slide11;

public class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);
	}
	
	public void meow() {
		System.out.println(name + " meoe meoeow moome.");
	}
	
	public void sound() {
		System.out.println(name + " phát ra âm thanh: meoe meoe.");
	}
}
