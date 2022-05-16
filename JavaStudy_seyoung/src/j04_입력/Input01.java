package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {

		// 일반 자료형 붉은 색
		// 참조 자
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("값 입력: ");
		int num = scanner.nextInt();
	
		System.out.println("입력한 값: " + num);
		
	}
}
