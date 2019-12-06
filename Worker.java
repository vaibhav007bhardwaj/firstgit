package p1;

public class Worker extends Employee {
	
	private float hoursWorked;
	private double hourlyRate;
	
	public Worker(int deptid, String name, String email, double basic,float hoursWorked,double hourlyRate) {
		super(deptid, name, email, basic);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return super.toString()+"hoursWorked: "+ hoursWorked+"hourlyRate :"+hourlyRate	;
		}
	public double hourlyRate() {
		return hourlyRate;
	}
	public double netSalary() {
		return getBasic()+hourlyRate*hoursWorked;
	}
}