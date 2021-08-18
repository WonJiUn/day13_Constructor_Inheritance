package day13_Constructor_Inheritance;

import java.io.IOException;
import java.util.*;

class Win7{
	private String s = null;
	private HashMap map = new HashMap();
	private ArrayList arr;
	
	
	
	public boolean flag() {
		return false;
	}
	public void PB(String s) {
		ProcessBuilder pro = new ProcessBuilder((String)map.get(s));
		if(map.containsKey(s)) {
			System.out.println(map.get(s) + " 동작합니다");
			
			try {
				pro.start();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}else {
			System.out.println("없는 기능 입니다");
		}
		
		
	}
	public void HashMap() {
		this.map.put("메모장", "notepad.exe");
		this.map.put("계산기", "calc.exe");
		//System.out.println("1. 메모장");
		//System.out.println("2. 계산기");
		
	}
	
	public ArrayList getarr() {
		arr = new ArrayList();
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			arr.add(it.next());
		}
		return arr;
	}
	
	public void Quiz_win7(){
		Scanner sc = new Scanner(System.in);
		Win7 w = new Win7();
		boolean flag = true;
		int select = 0;
		String s = null;
		ArrayList arr = null;
		
		System.out.println("===== 환 영 합 니 다 =====");
		while(flag) {
			
			System.out.println("1. 기능");
			System.out.println("2. off");
			System.out.print("입력 >>>> ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("사용 가능 기능");
				w.HashMap();
				w.getarr();
				arr = w.getarr();
				for(int i = 0; i<arr.size(); i++) {
					System.out.println((i+1) + " : " + arr.get(i));
				}
				System.out.print("사용할 기능 입력 : ");
				s = sc.next();
				w.PB(s);
				
				break;
			case 2:
				System.out.println("종료합니다");
				flag = w.flag();
				break;
			default : System.out.println("1 또는 2를 입력해주세요");
			}
		}
	}
}



