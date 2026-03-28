package NhanVien;

import java.util.HashMap;
import java.util.Map;


public class EmployeeService {
    Map<String, Employee> lsMap = new HashMap<>();

    public void addEmployee(Employee emp) {
    	lsMap.put(emp.getId(), emp);
    }

    public void displayAll() {
    	for (Map.Entry<String, Employee> entry : lsMap.entrySet()) {
    		System.out.println(entry.getValue().toString());
    	}
    }

    public void findById(String id) {
		if (lsMap.containsKey(id)) {
			System.out.println(lsMap.get(id).toString());
		} else {
			System.out.println("Không tìm thấy nhân viên với ID: " + id);
		}
    }

    public void updateSalary(String id, double newSalary) {
			Employee emp = lsMap.get(id);
			emp.setSalary(newSalary);
			System.out.println("Cập nhật lương thành công cho nhân viên ID: " + id);
    }
}