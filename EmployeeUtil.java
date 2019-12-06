package p1;

public class EmployeeUtil {

	private static int counter;
	public static void addEmp(Employee[] emp, Employee e) {
		if(counter<emp.length) {
			emp[counter++]=e;
		}
		else {
			System.out.println("No Vacancy");
		}
	}
}
