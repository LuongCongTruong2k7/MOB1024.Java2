package enity_ai;

import java.util.Scanner;

public class VIPTicket extends Ticket{
	private double serviceFee;
	private double giftComboPrice;
	
	public VIPTicket(double serviceFee, double giftComboPrice) {
		this.setserviceFee(serviceFee);
		this.setgiftComboPrice(giftComboPrice);
	}
	
	public VIPTicket(String id, String movieName, double basePrice, double serviceFee, double giftComboPrice) {
		super(id, movieName, basePrice);
		this.setserviceFee(serviceFee);
		this.setgiftComboPrice(giftComboPrice);
	}

	public double getserviceFee() {
		return serviceFee;
	}
	
	public void setserviceFee(double serviceFee) {
		Scanner s = new Scanner(System.in);
		if (serviceFee >= 0) {
			this.serviceFee = serviceFee;
		} else {
			do {
				System.out.print("serviceFee không được < 0 vui lòng nhập lại: ");
				serviceFee = s.nextDouble();
			}while (serviceFee < 0);
			this.serviceFee = serviceFee;
		}
	}
	
	public double getgiftComboPrice() {
		return giftComboPrice;
	}
	
	public void setgiftComboPrice(double giftComboPrice) {
		Scanner s = new Scanner(System.in);
		if (giftComboPrice >= 0) {
			this.giftComboPrice = giftComboPrice;
		} else {
			do {
				System.out.print("giftComboPrice không được < 0 vui lòng nhập lại: ");
				giftComboPrice = s.nextDouble();
			}while (giftComboPrice < 0);
			this.giftComboPrice = giftComboPrice;
		}
	}

	@Override
	public double calculateTotal() {
		return super.calculateTotal() + this.serviceFee + this.giftComboPrice;
	}
	
	@Override
	public String toString() {
		return "VIPTicket [id = " + getid() + ", movieName = " + getmovieName() + ", basePrice = " + getbasePrice() + ", serviceFee = " + serviceFee + ", giftComboPrice = " + giftComboPrice + ", finalticketprice = " + calculateTotal() + " ] ";
	}
}	
