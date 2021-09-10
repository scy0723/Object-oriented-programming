package °´Áölab11;

public class Manager extends Employee{
	public static int initial_manager_number=1000;
	public static String initial_manager_dept="Sales Management";
	public static int intial_manager_salary=3000;
	
	public Manager(String name) {
		super(name, ++initial_manager_number , initial_manager_dept, intial_manager_salary);
		// TODO Auto-generated constructor stub
	}
	
}
