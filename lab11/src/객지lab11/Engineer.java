package °´Áölab11;

public class Engineer extends Employee{
	public static int initial_engineer_number=2000;
	public static String initial_engineer_dept="Computational Management";
	public static int intial_engineer_salary=3300;
	
	public Engineer(String name) {
		super(name, ++initial_engineer_number, initial_engineer_dept, intial_engineer_salary);
		// TODO Auto-generated constructor stub
	}
}
