package °´Áölab6;

public class Employee {
	private String name;
	private int employeeNum;
	private String department;
	//constructor(name,employeeNum,department)
	public Employee(String name, int employeeNum, String department) {
		super();
		this.name = name;
		this.employeeNum = employeeNum;
		this.department = department;
	}
	//constructor(name,employeeNum)
	public Employee(String name, int employeeNum) {
		super();
		this.name = name;
		this.employeeNum = employeeNum;
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//equals
	public boolean equals(Object otherObject) {
		if(otherObject==null)
			return false;
		else if(getClass()!=otherObject.getClass()) 
			return false;
		else {
			Employee otherEmployee=(Employee)otherObject;
			return (name.equals(otherEmployee.name)&&employeeNum==otherEmployee.employeeNum);
		}
	}
	public String toString() {
		return "Name: [" + name + "]\nEmp#: [" + employeeNum + "]";
	}
	

}
