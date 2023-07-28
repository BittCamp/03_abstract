package abstract_; //김찬영  2023-07-21 오후 03:30:08 ]

public abstract class AbstractTest { // POJO 형식 (Plain Old Java Object) 변수잡고 , 세터게터 잡는 기본 형식을 말한다.
	String name;   
	
	public String getName() { // 메소드의 구현
		return name;
	}
	
	public abstract void setName(String name); //추상메소드 : 현재 없지만,  나중에 잡겠다. 
	
}


