package mainPackage;

import java.util.ArrayList;
import enity.*;

public class MainLab1_Bai2 {
    public static void main(String[] args) {
        ArrayList<Employee> ListEmployee = new ArrayList<Employee>();

        ListEmployee.add(new FullTimeEmployee("FT001", "John Doe", 5000, 1000, 200));
        ListEmployee.add(new FullTimeEmployee("FT002", "Jane Smith", 6000, 1200, 100));
        ListEmployee.add(new PartTimeEmployee("PT001", "Peter Jones", 0, 40, 20));
        ListEmployee.add(new PartTimeEmployee("PT002", "Alice Brown", 0, 30, 25));
        ListEmployee.add(new FullTimeEmployee("", "Invalid Employee", -100, -500, -100));

        for (Employee e : ListEmployee) {
            System.out.println(e.toString());
            ;
        }

        Employee max = ListEmployee.get(0);
        for (Employee e : ListEmployee) {
            if (e.income() > max.income()) {
                max = e;
            }
        }
    }
}
