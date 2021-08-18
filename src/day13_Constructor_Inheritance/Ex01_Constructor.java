package day13_Constructor_Inheritance;

class Constructor01{
	public Constructor01(String s){
		System.out.println(s + " : 생성자 실행");
	}
	public Constructor01(){
		System.out.println("default 생성자 실행");
	}
	public void test(String s) {
		System.out.println(s + " : test 실행");
	}
	public void test() {
		System.out.println("기본 테스트");
	}
}

public class Ex01_Constructor {
	public static void main(String[] args) {
		
		/*
		 생성자
		 - 보통 초기화를 하고자 할때 사용한다.
		 - 객체가 생성될때 자동으로 호출된다.
		 
		 생성자 만드는 방법
		 - 클래스 이름과 동일하게 만든다
		 - 반환타입은 없어야 된다
		 */
		
		//생성자를 만들지 않을 경우 Constructor01(){} 이라는 디폴트 생성자가 생겼다가 없어짐
		//생성자를 하나 만드는 순간 디폴트생성자는 제공되지 않음
		
		Constructor01 con = new Constructor01("생성자");	//따로 호출을 하지 않아도 자동실행됨
		Constructor01 con01 = new Constructor01();	
		
		con.test("테스트");	//호출을 해야 실행됨
		con.test();			//오버로딩				
		
	}
}
