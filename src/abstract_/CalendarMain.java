package abstract_;//[ 김찬영  2023-07-21 오후 04:18:41 ]

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

//숙제
class CalendarEx{
	private int year;
	private int month;
	private int week;
	private int lastDay; // 28 , 29 , 30 , 31
	
	public CalendarEx() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도 입력 : ");
		this.year = scan.nextInt();
		System.out.println("월 입력 : ");
		this.month = scan.nextInt();
	}
	
	public void calc() {
		 //시스템 날짜를 기준으로 생성된다.
		Calendar cal = new GregorianCalendar(); //Sub class 생성
		
		// cal.set(Calendar.YEAR, year);
		// cal.set(Calendar.MONTH, month-1);
		// cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(year, month-1,1);
		
		week = cal.get(Calendar.DAY_OF_WEEK); // 1일에 해당하는 요일, 일 -1 , 월 -1 ,
		lastDay = cal.getMaximum(Calendar.DAY_OF_MONTH); // 28 ,29, 30 ,31
	}
	
	public void display() {
		 System.out.println("일\t월\t화\t수\t목\t금\t토");
		 
		 for(int i =1; i<week; i++) {
			 System.out.print("\t");			 
		 }
		 for(int i =1; i<=lastDay; i++) {
			 System.out.print(i + "\t");			 
			 
			 if(week%7 ==0)System.out.println();
			 week++;
		 }//for
	}
}
//-----------------
public class CalendarMain {

	public static void main(String[] args) {
		CalendarEx c = new CalendarEx();
		c.calc();
		c.display();
	}
}
/* 숙제
[문제] 만년달력
- 년도, 월을 입력하여 달력을 작성하시오
        
클래스명 : CalendarEx
필드 : 
메소드 - 기본 생성자 : 월, 일을 입력
       calc()    : 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                   매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
       display() : 출력

클래스명 : CalendarMain

[실행결과]
년도 입력 : 2002
월 입력 : 10	

일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31
 */