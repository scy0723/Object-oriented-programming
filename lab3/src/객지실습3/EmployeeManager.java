package °´Áö½Ç½À3;

public class EmployeeManager {

	public static void main(String[] args) {
		Employee one=new Employee("James Wright", 42,"Manager",20000);
		Employee two=new Employee("Amy Smith",27,"Design Coordinator",8000,15);
		Employee three=new Employee("Peter Coolidge",32,"Assistant Manager",12000,7);
		Employee four=new Employee("John Doe",22,"Engineer",10000,10);
		
		System.out.println(one.tostring()+"\n"+two.tostring()+"\n"+three.tostring()+"\n"+four.tostring());
		
		Employee five= new Employee("Amy Smith",27,"Design Coordinator",18000);
		System.out.println(five.equals(two));
		
		one.vacation(10);
		three.vacation(10);
		System.out.println(one.tostring()+"\n"+two.tostring()+"\n"+three.tostring()+"\n"+four.tostring());

	}
}
