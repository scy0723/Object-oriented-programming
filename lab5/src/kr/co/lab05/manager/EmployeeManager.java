package kr.co.lab05.manager;

import kr.co.lab05.employee.*;
import java.time.LocalDateTime;


public class EmployeeManager {

	public static void main(String[] args) {
		Employee a=new Employee("Shin",4500);
		LocalDateTime gy=LocalDateTime.of(2020,04,16,10,00);
		System.out.println("계약일: "+gy.getYear()+"-0"+gy.getMonthValue()+"-"+gy.getDayOfMonth());
		System.out.println(a.toString());
		
		int incentive_month=(int)(Math.random()*12+1); //인센티브 받을 달
		int percent;
		int monthcnt=0;//1년 계산하기 위한 변수
		LocalDateTime now= LocalDateTime.of(2020, 04,16,10,00);//현재 날짜
		while(true) {
			now=now.plusMonths(1);//1달씩 더해주기
			monthcnt++;
			//System.out.println(monthcnt+"개월차, 현재"+now.getMonthValue()+"월, "+incentive_month);
			a.receiveSalary();//그 달 월급 받기
			
			if(now.getMonthValue()==incentive_month) {//인센티브 달
				a.receiveSalary(); //인센티브는 월급의 100프로
				System.out.println((now.getYear()-gy.getYear()+1)+"년차 "+now.getMonthValue()+"월에 인센티브를 받았습니다.");
			}
			if(monthcnt==12) {//1년이 지났으면
				percent=(int)(Math.random()*11);//percent 난수 설정
				a.increaseYearlySalary(percent);//연봉 올리기
				System.out.println(now.getYear()-gy.getYear()+1+"년차 연봉이 "+percent+"% 올랐습니다.");
				incentive_month=(int)(Math.random()*12+1);//인센티브 받는 달 바꾸기
				monthcnt=0;//1년 세는 변수 초기화
		
			}
			
			if(a.getBalance()>=20000) {
				System.out.println(now.getYear()+"-"+now.getMonthValue()+"-"+now.getDayOfMonth());
				break;
			}
		}
		System.out.println("날짜: "+a.toString());
		
	}

}
