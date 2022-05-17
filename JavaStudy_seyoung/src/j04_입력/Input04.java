package j04_입력;

import java.util.Scanner;

public class Input04 {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String summary = null;
		char country = 0;
		int time  = 0;
		String director = null;
		String grade = null;
		String hit = null;
		
		
	
		System.out.print("개요: ");
		summary = scanner.nextLine();
		System.out.print("나라: ");
		country = scanner.next().charAt(0);
		System.out.print("시간: ");
		time = scanner.nextInt();
		System.out.print("감독: ");
		scanner.nextLine();
		director = scanner.nextLine();
		System.out.print("등급: ");
		grade = scanner.nextLine();
		System.out.print("흥행: ");
		hit = scanner.next();

		
	System.out.println("개요:" + summary);
	System.out.println("나라:" + country);
	System.out.println("시간:" + time);
	System.out.println("감독: " + director);
	System.out.println("등급: " + grade);
	System.out.println("흥행: " + hit);
	
	
	
	
		
		
	}
}
