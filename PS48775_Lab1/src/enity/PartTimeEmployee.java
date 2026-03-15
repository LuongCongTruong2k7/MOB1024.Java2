package enity;

public class PartTimeEmployee extends Employee{
    private double workingHours;
    private double hourlyRate;
    
	public PartTimeEmployee(String id, String name, double basicSalary, double workingHours, double hourlyRate) {
		super(id, name, basicSalary);
		this.setWorkingHours(workingHours);
		this.setHourlyRate(hourlyRate);
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		if (workingHours >= 0) {
            this.workingHours = workingHours;
        } else {
            this.workingHours = 0;
        }
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        } else {
            this.hourlyRate = 0;
        }
	}

	@Override
	public double income() {
        return this.workingHours * this.hourlyRate;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [id=" + getId() + ", name=" + getName() + ", basicSalary=" + getBasicSalary() + ", workingHours=" + workingHours + ", hourlyRate=" + hourlyRate + ", income=" + income() + "]";
	}
}
