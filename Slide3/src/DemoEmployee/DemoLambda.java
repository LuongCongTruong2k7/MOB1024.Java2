package DemoEmployee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoLambda {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("E001", "Alice", 5000),
				new Employee("E002", "Bob", 6000),
				new Employee("E003", "Charlie", 5500),
				new Employee("E004", "David", 7000)
		);
		
//		Predicate<Integer> isEven = n -> n % 2 == 0; {
//			System.out.println(isEven.test(4)); 
//		}
		
		Predicate<Integer> isPositive = n -> n > 0; {
			System.out.println(isPositive.test(1)); 
		}
	}
}