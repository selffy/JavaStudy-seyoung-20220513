package j03_연산;

import java.security.DrbgParameters.NextBytes;

import java.util.Scanner;

public class Operation08 {

	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("값 입력: ");
	
	
		/*
		 * num = 10
		 * 
		 * num이 짝수면 짝수, 홀수면 홀수를 출력하는 프로그램을 작성하세요.
		 * 
		 */
		
		int num = scanner.nextInt();
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
			
			System.out.print(result);
		
		
	}
}
