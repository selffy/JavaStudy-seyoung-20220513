package j04_입력;

import java.util.Scanner;

public class Input05 {

	
	public static void main(String[] args) {
		
		Scanner scannaer = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		System.out.print("두 수를 입력하세요: ");
		a = scannaer.nextInt();
		b = scannaer.nextInt();
		
		System.out.println("두 수의 합은: " + (a + b));
		
		
	}
	
}
