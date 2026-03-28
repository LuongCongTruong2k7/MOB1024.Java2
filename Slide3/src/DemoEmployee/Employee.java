package DemoEmployee;

public class Employee {
	private String id;
	private String name;
	private double salary;
	
	public Employee(String id, String name, double salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
	}

	public String getId() {
		return id;
	}

	public boolean setId(String id) {
		if (id != null && !id.trim().isEmpty()) {
			this.id = id;
			return true;
		}
		this.id = id;
		return false;
	}

	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		if (name != null && !name.trim().isEmpty()) {
			this.name = name;
			return true;
		}
		return false;
	}

	public double getSalary() {
		return salary;
	}

	public boolean setSalary(double salary) {
		if (salary >= 0) {
			this.salary = salary;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
