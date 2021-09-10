package kr.co.lab05.manager;

import kr.co.lab05.employee.*;
import java.time.LocalDateTime;


public class EmployeeManager {

	public static void main(String[] args) {
		Employee a=new Employee("Shin",4500);
		LocalDateTime gy=LocalDateTime.of(2020,04,16,10,00);
		System.out.println("�����: "+gy.getYear()+"-0"+gy.getMonthValue()+"-"+gy.getDayOfMonth());
		System.out.println(a.toString());
		
		int incentive_month=(int)(Math.random()*12+1); //�μ�Ƽ�� ���� ��
		int percent;
		int monthcnt=0;//1�� ����ϱ� ���� ����
		LocalDateTime now= LocalDateTime.of(2020, 04,16,10,00);//���� ��¥
		while(true) {
			now=now.plusMonths(1);//1�޾� �����ֱ�
			monthcnt++;
			//System.out.println(monthcnt+"������, ����"+now.getMonthValue()+"��, "+incentive_month);
			a.receiveSalary();//�� �� ���� �ޱ�
			
			if(now.getMonthValue()==incentive_month) {//�μ�Ƽ�� ��
				a.receiveSalary(); //�μ�Ƽ��� ������ 100����
				System.out.println((now.getYear()-gy.getYear()+1)+"���� "+now.getMonthValue()+"���� �μ�Ƽ�긦 �޾ҽ��ϴ�.");
			}
			if(monthcnt==12) {//1���� ��������
				percent=(int)(Math.random()*11);//percent ���� ����
				a.increaseYearlySalary(percent);//���� �ø���
				System.out.println(now.getYear()-gy.getYear()+1+"���� ������ "+percent+"% �ö����ϴ�.");
				incentive_month=(int)(Math.random()*12+1);//�μ�Ƽ�� �޴� �� �ٲٱ�
				monthcnt=0;//1�� ���� ���� �ʱ�ȭ
		
			}
			
			if(a.getBalance()>=20000) {
				System.out.println(now.getYear()+"-"+now.getMonthValue()+"-"+now.getDayOfMonth());
				break;
			}
		}
		System.out.println("��¥: "+a.toString());
		
	}

}
