package day13_Constructor_Inheritance;

import java.util.Scanner;

class login extends Win7 {
	private int select;
	private String id, pw;
	private String loginId, loginPw;
	boolean bool = true;
	Scanner sc = new Scanner(System.in);
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getSelect() {
		return select;
	}
	public String getid() {
		return id;
	}
	public String getpw() {
		return pw;
	}
	public String getLoginId() {
		return loginId;
	}
	public String getLoginPw() {
		return loginPw;
	}
	public void selectNum() {
		select = sc.nextInt();
	}
	public void loginFunc() {
		System.out.print("아이디 입력 : ");
		loginId = sc.next();
		System.out.print("비밀번호 입력 : ");
		loginPw = sc.next();
	}
	public void loginCheck(String loginId, String loginPw) {
		if(loginId.equals(this.id) && loginPw.equals(this.pw)) {
			System.out.println("인증 통과");
			super.Quiz_win7();
			logout();
		}
		else {
			System.out.println("인증 실패");
			
		}
	}
	public void createAccount() {
		System.out.print("가입 id : ");
		this.id = sc.next();
		System.out.print("가입 pw : ");
		this.pw = sc.next();
		System.out.println("저장 완료");
	}
	public void logout() {
		bool = false;
	}
	
	
}

public class Quiz01_login{
	
	public static void main(String[] args) {
		
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

