package abstract_; //[ 김찬영  2023-07-21 오후 03:16:40 ]
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
// Calendar 참고
public class Today {
	public static void main(String[] args) throws ParseException {
		 //  Exception (예외처리) 
		// 1. 컴파일 할때 터진다. - 미리보험 드는거. 자동차 보험 같은거.사고날까봐 미리 드는거 1.throws 자바가상머신에게 맡김 2. try catch 내가!
		// 2. 실행할때 터진다. -개발자가 실수해서 생긴거.
		Date date = new Date();
		System.out.println("오늘 날짜 : " + date);
		//https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html에 정의되어있음.
		SimpleDateFormat sdf = new SimpleDateFormat("y년 M월 d일 H:m:s E요일");   //  2023년 07월 21일
		SimpleDateFormat sdf1 = new SimpleDateFormat("y년 MM월 dd일 HH:mm:ss E요일"); 
		System.out.println("오늘 날짜 : " + sdf.format(date));
		System.out.println("오늘 날짜 : " + sdf1.format(date));
		System.out.println();
		
		
		//내 생일
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMdd");
		Date birth = input.parse("19930524"); //문자열을 날짜 형식으로 바꾸는 방법임. <==여기선 오류나서 예외처리 하라 나온게 아니라 보험가은거임.
		System.out.println("내 생일 : "+birth);
		System.out.println("내 생일 : "+ sdf.format(birth));
		
		// 시스템 날짜를 기준으로 생성된다.
		//Calendar cal = new Calendar(); //-추상클래스라 new를 못한다.  Cannot instantiate the type Calendar 인터페이스를 생성할수 없다. 추상이라 이런오류뜬다.
		//Calendar cal = new GregorianCalendar(); // Sub class 생성. 현재 자식클래스를 이용해서 생성.
		//Calendar cal =  new Calendar(); // new를 이렇게 안쓰고 ,메소드를 이용하여 클래스 생성가능하다.
		Calendar cal = Calendar.getInstance(); // 메소드를 이용하여 클래스 생성. Static 메소드
		
		int year = cal.get(Calendar.YEAR);	//int year = cal.get(1); 이렇게 알아먹기 힘들게 1이 아니라 ,,  알아보기 쉬우라고 년도로 받아들이게 상수화해놓음
		int month = cal.get(Calendar.MONTH)+1; // cal.get(2); 1월 - 0 으로 생각, 2월 - 1,
		int day = cal.get(Calendar.DAY_OF_MONTH); //cal.get(3); 
		System.out.println(year + "년 "+ month + " 월 " + day + "일");
		
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일 -1 , 월 -2 , 화 -3 
		String dayOfWeek = null;
		switch(week) {
		case 1 : dayOfWeek = "일"; break;
		case 2 : dayOfWeek = "월"; break;
		case 3 : dayOfWeek = "화"; break;
		case 4 : dayOfWeek = "수"; break;
		case 5 : dayOfWeek = "목"; break;
		case 6 : dayOfWeek = "금"; break;
		case 7 : dayOfWeek = "토"; 
		
		}
		  
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("===========================");
		
		System.out.println(year + "년 " + month +"월 "+ day +"일 "+ dayOfWeek+ "요일");
		System.out.println(hour + "시 " + minute +"분 "+ second +"초");
		
		

	}
}
