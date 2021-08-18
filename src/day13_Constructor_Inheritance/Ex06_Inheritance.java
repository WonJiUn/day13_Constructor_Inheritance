package day13_Constructor_Inheritance;

class AAA{
	public void aaa() {
		System.out.println("test");
	}
}

class Calc06 extends AAA{		//다중상속이 불가능하기 때문에 순차적으로 해야함
	public int n = 12345;
	public String s = "부모 문자열";
	private String ss = "private 변수";
	protected String sss = "protected 변수";
	public Calc06(String s) {
		System.out.println(s + "부모 생성자");
	}
	public void test() {
		System.out.println("부모 test 실행");
	}
}
class Computer06 extends Calc06{
	public int n = 7777;
	public Computer06(String ss) {
		super(ss);
		System.out.println(ss + " : 자식 생성자");
		super.test();
		this.test();
		System.out.println("this.n : " + this.n);
		System.out.println("super.s : " + s);
		//System.out.println("super private ss : " + super.ss);		//private은 자식이어도 접근불가
		System.out.println("super protected sss : " + super.sss);	//protected는 외부의 접근을 막으면서 자식에게만 접근허용
	}
	public void test() {
		System.out.println("자식 test 실행");		//오버라이딩
	}
}

public class Ex06_Inheritance {
	public static void main(String[] args) {
		
		Computer06 com = new Computer06("전달");
		
		
		
	}
}
