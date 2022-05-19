package j06_반복;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		
		/*
		 * 반복할 횟수를 입력하세요 : 5
		 * 
		 */
		
	Scanner scanner = new Scanner(System.in);
		
	int num = 0;
	int i = 0;
	
	System.out.println("반복을 입력하세요: ");
	
	num = scanner.nextInt();

	while (i < num) {
		System.out.println(num - 1);
		i++;
		
	}
	
	
	i = 0;
	
	while(i < num) {
		System.out.println(num - i);
		i++;
	}
	/*
	 * 20 출력하면 20부터 거꾸로 출력
	 */
	
	}
}
