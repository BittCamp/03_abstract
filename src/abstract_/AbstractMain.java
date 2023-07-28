package abstract_;//김찬영  2023-07-21 오후 03:30:08 ]

public class AbstractMain extends AbstractTest {

		@Override
		public void setName(String name) {
			this.name = name;
		}
		
		public static void main(String[] args) {
//			AbstractTest at = new AbstractTest(); 추상클래스는 new를 할수없다.
			AbstractTest at = new AbstractMain();
			at.setName("홍길동");
			System.out.println(at.getName());
		}
			
			

}
