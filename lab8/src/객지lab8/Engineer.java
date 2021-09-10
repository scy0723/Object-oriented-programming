package °´Áölab8;

import java.util.Objects;

public class Engineer extends Employee{
   double rate;
   public Engineer(String name,int employeeNum) {
      super(name, employeeNum);
      this.rate=4.0;
      this.department="Engineering";
   }
   
   public boolean equals(Object obj) {
      if(this==obj)
    	  return true;
      if(obj==null||getClass()!=obj.getClass())
    	  return false;
      Engineer engineer=(Engineer)obj;
      
      return Objects.equals(this.name, engineer.name)&&Objects.equals(this.employeeNum, engineer.employeeNum);
   }
   public String toString() {
      return "Name : "+this.name+
    		  "\nEmp# : "+this.employeeNum+
    		  "\nDept : "+this.department+"\n";
   }
   public double getPaid() {
      return workHrs*rate;
   }
}