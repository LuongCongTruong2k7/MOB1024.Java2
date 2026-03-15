package enity_ai;

import java.util.Scanner;

public class StudentTicket extends Ticket{
	private double discountRate;
	
	public StudentTicket(double discountRate) {
		this.setdiscountRate(discountRate);
	}
	
	public StudentTicket(String id, String movieName, double basePrice, double discountRate) {
		super(id, movieName, basePrice);
		this.setdiscountRate(discountRate);
	}

	public double getdiscountRate() {
		return discountRate;
	}
	
	public void setdiscountRate(double discountRate) {
		Scanner s = new Scanner(System.in);
		if (discountRate >= 0 && discountRate <= 1) {
			this.discountRate = discountRate;
		} else {
			do {
				System.out.print("discountRate phải nằm trong khoảng 0 đến 1 vui lòng nhập lại: ");
				discountRate = s.nextDouble();
			} while (discountRate < 0 || discountRate > 1);
		}
	}
	
	@Override
	public double calculateTotal() {
		return super.calculateTotal() + getbasePrice() - (this.getbasePrice() * this.discountRate);
	}
	
	@Override
	public String toString() {
		return "StudentTicket [id = " + getid() + ", movieName = " + getmovieName() + ", basePrice = " + getbasePrice() + ", discountRate = " + discountRate + ", finalticketprice = " + calculateTotal() + " ] ";
	}
}
