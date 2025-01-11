package Demo_HQL;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeHQL {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	private String Name;
	private String Deparment;
	private int salary;
	
	
	
	
	
	
	
	public EmployeeHQL() {


	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDeparment() {
		return Deparment;
	}
	public void setDeparment(String deparment) {
		Deparment = deparment;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
	
	
	public EmployeeHQL(int empid, String name, String deparment, int salary) {
		super();
		this.empid = empid;
		Name = name;
		Deparment = deparment;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeHQL [empid=" + empid + ", Name=" + Name + ", Deparment=" + Deparment + ", salary=" + salary
				+ "]";
	}
	
	
	
	

}
