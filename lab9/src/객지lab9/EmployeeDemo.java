package ����lab9;
import java.util.Scanner;

public class EmployeeDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee employee = new Employee("Shin");
		while(true) {
			System.out.print(employee.getWorkDay()+"���� �ٹ� �ð��� �Է��ϼ���: ");
			try {
				int workHours = scan.nextInt();
				scan.nextLine();
				if(workHours < 0) {
					throw new NegativeException();
				}
				else if (workHours == 0) {
					throw new Exception("Program Exit");
				}
				else if (workHours > 24) {
					throw new TooMuchStuffException(workHours);
				}
				else {
					employee.addWorkHours(workHours);
					employee.addWorkDay();
					System.out.println("�̸�: " + employee.getName());
					System.out.println("���� �ٹ� �ð�: " + employee.getWorkHours());
					System.out.println("No exception has been occured");
				}
			}catch(NegativeException e){
				System.out.println(e.getMessage());
			}catch(TooMuchStuffException e) {
				System.out.println(e.getInputNum() + ", " + e.getMessage());
			}catch (Exception e) {
				System.out.println(e.getMessage());
				scan.close();
				System.exit(0);
			}finally {
				System.out.println("End of try-catch statement");
			}
		}
	}

}
