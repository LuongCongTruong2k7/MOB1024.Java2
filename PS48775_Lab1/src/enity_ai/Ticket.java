package enity_ai;

import java.util.Scanner;

public class Ticket {
    private String id;
    private String movieName;
    private double basePrice;
    
    public Ticket() {
    }

    public Ticket(String id, String movieName, double basePrice) {
    	this.setid(id);
    	this.movieName = movieName;
    	this.setbasePrice(basePrice);
    }

	public String getid() {
		return id;
	}
	
	public void setid(String id) {
		Scanner s = new Scanner(System.in);
		if (id != "") {
			this.id = id;
		} else {
			do {
				System.out.print("id không được để trống vui lòng nhập lại: ");
				id = s.nextLine();		
			} while (id == "");
			this.id = id;
		}
	}
	
	public String getmovieName() {
		return movieName;
	}
	
	public void setmovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public double getbasePrice() {
		return basePrice;
	}
	
	public void setbasePrice(double basePrice) {
		Scanner s = new Scanner(System.in);
		if (basePrice >= 0) {
			this.basePrice = basePrice;
		} else {
			do {
				System.out.print("basePrice không được < 0 vui lòng nhập lại: ");
				basePrice = s.nextDouble();
			} while (basePrice < 0);
			this.basePrice = basePrice;
		}
	}
	
	public double calculateTotal() {
		return basePrice;
	}

	@Override
	public String toString() {
		return "Ticket [id = " + id + ", movieName = " + movieName + ", basePrice = " + basePrice +", finalticketprice = " + calculateTotal() + " ] ";
	}
}
