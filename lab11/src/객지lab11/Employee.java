package °´Áölab11;

public class Employee{
	private String name;
	private int employeeNum;
	private String department;
	private double salary;
	public String getName() {
		return name;
	}
	public int getEmployeeNum() {
		return employeeNum;
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Name : " + name + 
				"\nEmployee Number : " + employeeNum + 
				"\nDepartment : " + department + 
				"\nSalary :"+ salary;
	}
	public Employee(String name, int employeeNum, String department, double salary) {
		super();
		this.name = name;
		this.employeeNum = employeeNum;
		this.department = department;
		this.salary = salary;
	}
	
}
