package abstract_;
//[ 김찬영  2023-07-21 오후 04:37:36 ]
import java.util.Scanner;

abstract class Shape{
	protected double area;
	protected Scanner scan = new Scanner(System.in);

	public Shape() {
		System.out.println("Shape 기본생성자");
	}
	//\02_inheritance\src\inheritance\ShapeMain.java 이거랑 비교해보면 차이가 있다. 
	public abstract void calcArea();
	public abstract void dispArea();
}

//-------------
class Sam extends Shape{
	protected double base, height;
	
	public Sam() {
		System.out.println("Sam 기본생성자");
		System.out.println("밑변 : ");
		base = scan.nextInt();
		System.out.println("높이 : ");
		height = scan.nextInt();
	}
	@Override//calArea() 쓰면 에러뜸
	public void calcArea() {
		area = base * height / 2;
	}
	@Override
	public void dispArea() {
		System.out.println("삼각형 넓이 = "+ area );
	}
}
class Sa extends Shape{
	protected double width, height;
	
	public Sa() {
		System.out.println("Sa 기본생성자");
		System.out.println("가로 : ");
		width = scan.nextInt();
		System.out.println("세로 : ");
		height = scan.nextInt();
	}
	@Override//calArea() 쓰면 에러뜸
	public void calcArea() {
		area = width * height;
	}
	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 = "+ area );
	}
}
class Sadari extends Shape{
	protected double width, height,top,bottom;
	
	public Sadari() {
		System.out.println("Sadari 기본생성자");
		System.out.println("윗변 : ");
		top= scan.nextInt();
		System.out.println("밑변 : ");
		bottom = scan.nextInt();
		System.out.println("높이 : ");
		height = scan.nextInt();
	}
	@Override//calArea() 쓰면 에러뜸
	public void calcArea() {
		area = (top + bottom)*height/2;
	}
	@Override
	public void dispArea() {
		System.out.println("사다리꼴 넓이 = "+ area );
	}
}
//-------------
public class ShapeMain {

	public static void main(String[] args) {
//		Sam sam = new Sam();// 1:1관계, 결합도 100% 
//		sam.calcArea();
//		sam.dispArea();
//		System.out.println();
//		
//		Sa sa = new Sa();
//		sa.calcArea();
//		sa.dispArea();
//		System.out.println();
//		
//		Sadari sadari = new Sadari();
//		sadari.calcArea();
//		sadari.dispArea();
//		
		// 다형성 : 부모로 자식 메소드 컨트롤 하기위해. 만능리모컨 같은것..
		// 부모는 사각형 삼각형 사다리가 되든 부모가 처리한다. 
		// 회원가입, 공지사항, 어떤 다른 기능이 오던 부모가 처리한다. ==> 스프링에서도 쓰이는ㄱ ㅐ념.
		Shape shape;
		shape = new Sam(); // 부모 = 자식;
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new Sa(); // 부모 = 자식;
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new Sadari(); // 부모 = 자식;
		shape.calcArea();
		shape.dispArea();
		System.out.println();
	}
	
}
