package °´Áölab6;

public class Manager extends Employee {
	private int officeNum;
	private String team;
	//constructor
	public Manager(String name, int employeeNum, int officeNum, String team) {
		super(name, employeeNum);
		this.setDepartment("Management");
		this.officeNum = officeNum;
		this.team = team;
	}
	
	//getters and setters
	/*
	public int getOfficeNum() {
		return officeNum;
	}
	public void setOfficeNum(int officeNum) {
		this.officeNum = officeNum;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	*/
	
	//toString
	public String toString() {
		return "Name: [" + getName() + "]\nEmp#: [" + getEmployeeNum()
				+ "]\nlocation: ["+ getDepartment()+"], office: ["+officeNum+"]";
	}
	//equals
	public boolean equals(Object otherObject) {
		if(otherObject==null)
			return false;
		else if(getClass()!=otherObject.getClass()) 
			return false;
		else {
			Manager otherManager=(Manager)otherObject;
			return (getName().equals(otherManager.getName())
					&&getEmployeeNum()==otherManager.getEmployeeNum()
					&&officeNum==otherManager.officeNum);
		}
	}
	
	
}
