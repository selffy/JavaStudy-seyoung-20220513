package j04_입력;

import java.util.Scanner;

public class Homework {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("값 입력: ");
		
		int year = scanner.nextInt();
		
		int result = year % 4 == 0
				&& year % 100 != 0 
				|| year % 400 == 0 ? 1 : 0;
		
		System.out.print(result);
		
						
		// ctrl + Shift + L	 (단축키 도움말)
						
	}
	

}
