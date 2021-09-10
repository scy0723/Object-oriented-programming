package �����ǽ�3;
import java.util.Scanner;

public class Employee {

	private String name;
	private int age;
	private String position;
	private int salary;
	private int vacationDays;
	//constructors
	public Employee() {}
	public Employee(String name, int age) {
		this.name=name; this.age=age;
		position="Employee";
		salary=5000;
		vacationDays=20;
	}
	public Employee(String name, int age, String position, int salary) {
		this.name=name; this.age=age; this.position=position; this.salary=salary;
		vacationDays=20;
	}
	public Employee(String name, int age, String position, int salary,int vacationDays) {
		this.name=name; this.age=age; this.position=position; this.salary=salary; this.vacationDays=vacationDays;
	}
	//Getter, Setter Method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	///
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	///
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position=position;
	}
	///
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	///
	public int getVacationDays() {
		return vacationDays;
	}
	public void setVcationDays(int vacationDays) {
		this.vacationDays=vacationDays;
	}
	///
	public boolean equals(Employee e) {
		if(this.name.equals(e.name)&&this.age==e.age&&this.position.equals(e.position)) {
			System.out.print("���� �����Դϴ�: ");
			return true;
		}
		else {
			System.out.print("�ٸ� �����Դϴ�: ");
			return false;
		}
	}
	public String tostring() {
		return "Name: " +name+ ", Age: " +age+ ", Position: " +position
				+ ", Salary: " +salary+ ", VacationDays: " +vacationDays;
	}
	public boolean vacation(int vacation) {
		if(vacation>vacationDays) {
			System.out.println("���� �ް� �ϼ��� �����մϴ�.");
			return false;
		}
		else {
			vacationDays=vacationDays-vacation;
			System.out.println("�ް��� ����Ͽ����ϴ�. ���� �ް� �ϼ�: "+vacationDays);
			return true;
		}
	}
	
}
