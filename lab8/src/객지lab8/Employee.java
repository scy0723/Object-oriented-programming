package °´Áölab8;

import java.util.Objects;

public abstract class Employee {
   String name;
   int employeeNum;
   String department;
   int workHrs;
   double salary;

public Employee(String name, int employeeNum) {
	super();
	this.name = name;
	this.employeeNum = employeeNum;
	this.workHrs = 0;
	this.salary = 0;
}

   public String getDepartment() {
	return department;
}

public int getWorkHrs() {
	return workHrs;
}

public void setDepartment(String department) {
	this.department = department;
}

public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (department == null) {
		if (other.department != null)
			return false;
	} else if (!department.equals(other.department))
		return false;
	if (employeeNum != other.employeeNum)
		return false;
	return true;
}

public String toString() {
      return "Name : "+this.name+"\nEmp# : "+this.employeeNum+"\n";
}


public void doWork(int hrs) {
      this.workHrs+=hrs;
      this.salary=this.getPaid();
}
      
public abstract double getPaid();
  
public boolean equalPay(Employee emp) {
      if(this.salary==emp.salary)
    	  return true;
      return false;
  }
}