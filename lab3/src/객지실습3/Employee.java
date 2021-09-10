package 객지실습3;
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
			System.out.print("같은 직원입니다: ");
			return true;
		}
		else {
			System.out.print("다른 직원입니다: ");
			return false;
		}
	}
	public String tostring() {
		return "Name: " +name+ ", Age: " +age+ ", Position: " +position
				+ ", Salary: " +salary+ ", VacationDays: " +vacationDays;
	}
	public boolean vacation(int vacation) {
		if(vacation>vacationDays) {
			System.out.println("남은 휴가 일수가 부족합니다.");
			return false;
		}
		else {
			vacationDays=vacationDays-vacation;
			System.out.println("휴가를 사용하였습니다. 남은 휴가 일수: "+vacationDays);
			return true;
		}
	}
	
}
