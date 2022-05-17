package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {

		// 일반 자료형 붉은 색
		// 참조 자
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력한값1: ");
		int num1 = scanner.nextInt(); // 값을 입력 받는 역할 
		
		System.out.print("입력한값2: ");

		int num2 = scanner.nextInt();
		
	
		System.out.println("합계: " + (num1 + num2));
		
		scanner.next();					// 문자열(String)
		scanner.nextLine();				// 문자열(Stirng)
		scanner.next().charAt(0);		// 문자(char)
		scanner.nextInt();				// 정수(int)
		scanner.nextDouble();			// 실수(double)
	}
}
