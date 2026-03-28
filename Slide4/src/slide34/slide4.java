package slide34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class slide4 {
	public static void main(String[] args) {
		List<Integer> lsI = new ArrayList<>();
		List<Double> lsD = new ArrayList<>();
		
		
//		Scanner sc = new Scanner(System.in);
//		int diem;
//		
//		try {
//			System.out.print("Nhập điểm: ");
//			diem = sc.nextInt();
//			if(diem<0 || diem>10) throw new IllegalArgumentException("Điểm phải từ 0-10");
//			System.out.print("Điểm: " + diem);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
		
		
//		String s = "ba";
//		try {
//			int a = Integer.parseInt(s);
//			int b = 0;
//			System.out.println("Trước khi chia");
//			System.out.println("Chia: " + (a/b));
//			System.out.println("Sau khi chia");
//		} catch (NumberFormatException e) {
//			System.out.println("Dữ liệu sai không ép được");
//			
//		} catch (ArithmeticException e) {
//			System.out.println("Mẫu số bằng không");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		static int tong(int a, int b) {
			return a + b;
		}
		
		static double tong(double a, double b) {
			return a + b;
		}
		
		static <T extends Number> T tongGenerics(T a, T b) {
			if (a instanceof Integer && b instanceof Integer) {
				return (T) Integer.valueOf(a.intValue() + b.intValue()); 
			}
			if (a instanceof Double && b instanceof Double) {
				return (T) Double.valueOf(a.doubleValue() + b.doubleValue()); 
			}
			return null;
		}
	}
}
