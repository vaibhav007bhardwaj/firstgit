package p1;

public class Manager extends Employee {
	private double perBonus;
	public Manager(int deptid, String name, String email, double basic,double perBonus) {
		super(deptid, name, email, basic);
		this.perBonus=perBonus;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return super.toString()+" perBonus: "+perBonus;
	}
	public double netSalary() {
		return getBasic()+perBonus;
	}
	public double getPerBonus() {
		return perBonus;
	}

}
