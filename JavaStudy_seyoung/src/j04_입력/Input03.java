package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		
		/*
		 * [개인정보 입력]
		 * 이름: 셀피 						문자열
		 * 나이: 27							정수
		 * 연락처: 010-1234-5678			문자열
		 * 주소: 부산 부산진구				문자열
		 * 성별: 여							문자
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
	

		System.out.println("[개인정보 입력]");
		System.out.print("이름: "); 
		String name = scanner.next(); //이세영\n
		System.out.print("나이: "); 
		int age = scanner.nextInt(); //29\n
		System.out.print("연락처: ");
		String phone = scanner.next(); //010-5233-8952\n  // nextLine이 전에 입력되지 못한 enter을 출력함.
		System.out.print("주소: ");
		scanner.nextLine(); // 전에 입력되지 못한 enter를 상쇄시키기 위해 다음과 같은 코딩을 입력함
		String address = scanner.nextLine(); 
		System.out.print("성별: ");
		char gender = scanner.next().charAt(0);
		
		
		
		System.out.println("[개인정보 출력]");  
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("연락처: " + phone);
		System.out.println("주소: " + address);
		System.out.println("성별: " + gender);
		
		
		

		
		
		
		
	}
	
}
