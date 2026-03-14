package Slide11;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void bark() {
		System.out.println(name + " gaau gaauauS.");
	}
	
	public void sound() {
		System.out.println(name + " phát ra âm thanh: gaau gaau.");
	}
}
