package j04_입력;

import java.util.Scanner;

public class Input06 {

	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	int a = 0;
	int b = 0;
	int c = 0;
	
	System.out.print("두 수를 비교 했을 때 결과는? ");
	
	a = scanner.nextInt();
	b = scanner.nextInt();
	c = scanner.nextInt();

	System.out.println(a > b ? ">" : a < b ? "<" : "==");

	
	
	}
}
