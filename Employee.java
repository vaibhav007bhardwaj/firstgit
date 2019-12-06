package p1;
import java.util.*;

public class Employee {
private int deptid;
private int id;
private static int idCounter;
private String name,email;
private double basic;
public Employee(int deptid,String name,String email,double basic) {
	this.deptid=deptid;
	id=idCounter++;
	this.name=name;
	this.email=email;
	this.basic=basic;
}
static {
	idCounter=100;
}
public double getBasic() {
	return basic;
}
@Override
public String toString() {
	return "Dept id: "+deptid+"id: "+id+" Name: "+name+" email: "+email+" Basic: "+basic;
}
public int getId() {
	return id;
}
public void incSal(int per){
	basic = (1+(per/100.0))*basic;
}
}
