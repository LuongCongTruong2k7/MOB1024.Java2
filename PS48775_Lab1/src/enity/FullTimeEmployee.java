package enity;

public class FullTimeEmployee extends Employee{
    private double bonus;
    private double penalty;
    
	public FullTimeEmployee(String id, String name, double basicSalary, double bonus, double penalty) {
		super(id, name, basicSalary);
		this.setBonus(bonus);
		this.setPenalty(penalty);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		if (bonus >= 0) {
			this.bonus = bonus;
		} else {
			this.bonus = 0;
		}
	}

	public double getPenalty() {
		return penalty;
	}

	public void setPenalty(double penalty) {
		if (penalty >= 0) {
			this.penalty = penalty;
		} else {
			this.penalty = 0;
		}
	}

	@Override
	public double income() {
		return super.income() + this.bonus - this.penalty;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [id=" + getId() + ", name=" + getName() + ", basicSalary=" + getBasicSalary() + ", bonus=" + bonus + ", penalty=" + penalty + ", income=" + income() + "]";
	}
}
