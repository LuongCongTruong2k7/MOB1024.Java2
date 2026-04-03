package Lab5;

public class MainBai3 {
	public static void main(String[] args) {
		EmployeeService_Bai3 service = new EmployeeService_Bai3();
		service.readFromFile("employees.dat");
		System.out.println(service.getEmployees().toString());
		
//		List<Employee_Bai3> employees = Arrays.asList(
//				new Employee_Bai3("E001", "Nguyen Van A", 5000),
//				new Employee_Bai3("E002", "Le Thi B", 6000),
//				new Employee_Bai3("E003", "Tran Van C", 5500),
//				new Employee_Bai3("E004", "Pham Thi D", 7000),
//				new Employee_Bai3("E005", "Hoang Van E", 6500)
//		);
//		service.addEmployees(employees);
		service.writeToFile("employees.dat");
	}
}
