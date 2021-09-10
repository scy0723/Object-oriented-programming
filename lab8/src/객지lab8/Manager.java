package °´Áölab8;

import java.util.Objects;

public class Manager extends Employee{
   double overtimeRate;
   double rate;
   int regularHrs;
   public Manager(String name, int employeeNum) {
      super(name,employeeNum);
      this.rate=5.0;
      this.overtimeRate=8.0;
      this.regularHrs=40;
      this.department="Management";
   }
   public boolean equals(Object obj) {
      if(this==obj)
    	  return true;
      if(obj==null)
    	  return false;
      if(getClass()!=obj.getClass())
    	  return false;
      Manager other=(Manager)obj;
      return Objects.equals(this.name, other.name)&&Objects.equals(this.employeeNum, other.employeeNum);
   }
   public String toString() {
      return "Name : "+this.name+
    		  "\nEmp# : "+this.employeeNum+
    		  "\nDept : "+this.department+"\n";
   }
   public double getPaid() {
      if(this.workHrs<40)
    	  return workHrs*rate;
      return (regularHrs*rate)+(workHrs-regularHrs)*overtimeRate;
   }
}