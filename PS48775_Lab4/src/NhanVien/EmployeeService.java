package NhanVien;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
    Map<String, Employee> mapEmp = new HashMap<>();

    public void addEmployee(Employee emp) throws DuplicateEmployeeException, InvalidSalaryException {
        if (emp.getSalary() < 0) {
            throw new InvalidSalaryException("Lương không được nhỏ hơn 0");
        }

        if (mapEmp.containsKey(emp.getId().toLowerCase())) {
            throw new DuplicateEmployeeException("Nhân viên đã tồn tại");
        }

        mapEmp.put(emp.getId().toLowerCase(), emp);
    }

    public Employee findEmployeeByID(String id) {
        return mapEmp.get(id.toLowerCase());
    }
}
