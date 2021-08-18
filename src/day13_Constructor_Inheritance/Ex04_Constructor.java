package day13_Constructor_Inheritance;

class Singleton04{
	private static Singleton04 si;
	private Singleton04() {		
		System.out.println("기본 생성자 실행");
	}
	public static Singleton04 getInstance() {
		System.out.println("si : " + si);
		if(si == null)
			si = new Singleton04();		//si가 null이 아니면 new를 만나지 않게되고, 기존의 객체값을 돌려주게됨
		return si;
	}
}

public class Ex04_Constructor {
	public static void main(String[] args) {
		
		//Singleton04 si = new Singleton04();
		//생성자를 private로 만들었기 때문에 외부에서 new로 접근불가
		
		Singleton04 si01 = Singleton04.getInstance();
		System.out.println("si01 : " + si01);	//아직 new를 만나 객체가 만들어지지 않았기때문에 null로 출력됨
		//위에서 si = new Singleton04(); 를 넣으면 인스턴스값이 제대로 나옴
		Singleton04 si02 = Singleton04.getInstance();
		System.out.println("si02 : " + si02);
	}
}
