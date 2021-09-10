package °´Áölab6;

public class Engineer extends Employee{
	private String workZone;
	private String project;
	//constructor
	public Engineer(String name, int employeeNum, String workZone, String project) {
		super(name, employeeNum);
		this.setDepartment("Engineering");
		this.workZone = workZone;
		this.project = project;
	}
	//getters and setters
	/*
	public String getWorkZone() {
		return workZone;
	}

	public void setWorkZone(String workZone) {
		this.workZone = workZone;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
*/
	//equals
	public boolean equals(Object otherObject) {
		if(otherObject==null)
			return false;
		else if(getClass()!=otherObject.getClass()) 
			return false;
		else {
			Engineer otherEngineer=(Engineer)otherObject;
			return (getName().equals(otherEngineer.getName())
					&&getEmployeeNum()==otherEngineer.getEmployeeNum()
					&&workZone.equals(otherEngineer.workZone));
		}
	}
	//toString
	public String toString() {
		return "Name: [" + getName() + "]\nEmp#: [" + getEmployeeNum()
				+ "]\nlocation: ["+ getDepartment()+"], zone: ["+workZone+"]";
	}
	
}
