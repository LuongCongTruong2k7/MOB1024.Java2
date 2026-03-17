package mainPackage;

import enity_ai.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainLab1_Bai4 {

	public static void main(String[] args) {
		ArrayList<Ticket> listTickets = new ArrayList<Ticket>();
		try (Scanner s = new Scanner(System.in)) {

			while (true) {
				System.out.print(
						"Nhập loại vé (1: Ticket, 2: StudentTicket, 3: VIPTicket, 4: Dữ liệu mẫu để test, 0: Exit): ");
				int choice = s.nextInt();
				s.nextLine();

				if (choice == 0) {
					break;
				}

				switch (choice) {
					case 1:
						Ticket ticket = new Ticket();
						System.out.print("Nhập id: ");
						ticket.setid(s.nextLine());
						System.out.print("Nhập movieName: ");
						ticket.setmovieName(s.nextLine());
						System.out.print("Nhập basePrice: ");
						ticket.setbasePrice(s.nextDouble());
						s.nextLine();
						listTickets.add(ticket);
						break;
					case 2:
						StudentTicket studentTicket = new StudentTicket(0);
						System.out.print("Nhập id: ");
						studentTicket.setid(s.nextLine());
						System.out.print("Nhập movieName: ");
						studentTicket.setmovieName(s.nextLine());
						System.out.print("Nhập basePrice: ");
						studentTicket.setbasePrice(s.nextDouble());
						System.out.print("Nhập discountRate: ");
						studentTicket.setdiscountRate(s.nextDouble());
						s.nextLine();
						listTickets.add(studentTicket);
						break;
					case 3:
						VIPTicket vipTicket = new VIPTicket(0, 0);
						System.out.print("Nhập id: ");
						vipTicket.setid(s.nextLine());
						System.out.print("Nhập movieName: ");
						vipTicket.setmovieName(s.nextLine());
						System.out.print("Nhập basePrice: ");
						vipTicket.setbasePrice(s.nextDouble());
						System.out.print("Nhập serviceFee: ");
						vipTicket.setserviceFee(s.nextDouble());
						System.out.print("Nhập giftComboPrice: ");
						vipTicket.setgiftComboPrice(s.nextDouble());
						s.nextLine();
						listTickets.add(vipTicket);
						break;
					case 4:
						listTickets.add(new Ticket("T001", "Movie A", 100.0));
						listTickets.add(new StudentTicket("S001", "Movie B", 80.0, 0.2));
						listTickets.add(new VIPTicket("V001", "Movie C", 150.0, 20.0, 30.0));
						listTickets.add(new StudentTicket("S002", "Movie D", 90.0, 0.1));
						listTickets.add(new VIPTicket("V002", "Movie E", 200.0, 25.0, 50.0));
						break;
					default:
						System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
				}
			}
		}

		if (listTickets.isEmpty()) {
			System.out.println("Không có vé nào để hiển thị.");
			return;
		}

		for (Ticket t : listTickets) {
			System.out.println(t.toString());
		}

		Ticket MaxTicket = listTickets.get(0);
		for (Ticket t : listTickets) {
			if (t.calculateTotal() > MaxTicket.calculateTotal()) {
				MaxTicket = t;
			}
		}
	}
}
