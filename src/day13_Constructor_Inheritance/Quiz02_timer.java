package day13_Constructor_Inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

class TimerQuiz{
	private Date date;
	private SimpleDateFormat simpl;
	
	public void setDate() {
		date = new Date();
		simpl = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		
	}
	public String getDate() {
		return simpl.format(date);
	}
	
	public void time() {
		for(int i = 0; i<10; i++) {
			setDate();
			String s = getDate();
			System.out.println(s);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			
		}
	}
	
}

public class Quiz02_timer extends Quiz01_login{
	public static void main(String[] args) {
		TimerQuiz tq = new TimerQuiz();
		tq.time();
		
		login q = new login();
		
		while(q.bool) {
			System.out.println("1.로그인  2.가입  3.로그아웃");
			System.out.print(">>> ");
			q.selectNum();
			
			switch(q.getSelect()) {
			case 1:
				q.loginFunc(); 
				q.loginCheck(q.getLoginId(), q.getLoginPw());
				
				break;
			case 2:
				q.createAccount();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다");
				q.logout();
				break;
			default : System.out.println("1~3중에 하나를 입력해주세요");
			}
		}
	}
}
