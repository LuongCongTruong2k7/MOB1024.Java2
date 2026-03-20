package NhanVien;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> list = new ArrayList<>();

    public void add(Employee e) {
        list.add(e);
    }

    public void show() {
        if (list.isEmpty()) {
            System.out.println("Danh sách nhân viên trống");
            return;
        }
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    public Employee findById(String id) {
        for (Employee e : list) {
            if (e.getId().equalsIgnoreCase(id)) {
                return e;
            }
        }
        return null;
    }

    public void updateSalary(String id, double newSalary) {
        Employee e = findById(id);
        if (e != null) {
            e.setSalary(newSalary);
            System.out.println("Cập nhật lương thành công cho nhân viên: " + e.getName());
        } else {
            System.out.println("Không tìm thấy nhân viên với ID: " + id);
        }
    }
}