package day13_Constructor_Inheritance;

import java.util.Calendar;

class Singleton01{
	public int num;
}

public class Ex03_Singleton {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();		//new로 객체를 만들지 않는 경우
		
		Singleton01 si = new Singleton01();
		Singleton01 si02 = si;	//new Singleton01();
		si.num = 12345;
		si02.num = 4444;
		System.out.println("si.num : " + si.num);
		System.out.println("si02.num : " + si02.num);
		
		System.out.println("si : " + si);
		System.out.println("si02 : " + si02);
		
		//클래스에 하나의 객체를 만들어서 공유하는것
		
	}
}
