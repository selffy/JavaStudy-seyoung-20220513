package j07_메소드;

import java.util.Scanner;

public class Method01 {

	public static int clacformula1(int a, int b, int c, int d, int e) {
		int result = a + (b * c) - (d * e);
		return result;
		//함수명을 지을 때는 동사 형태로 짓는 것이 좋다.
		// 변수명은 명사 형태
	}
	
	public static void main(String[] args) {
		
		Scanner scaner = new Scanner(System.in);
		
		int a, b, c, d, e;
		int r1, r2, r3, r4;
		
		a = scaner.nextInt();
		b = scaner.nextInt();
		c = scaner.nextInt();
		d = scaner.nextInt();
		e = scaner.nextInt();

		r1 = clacformula1(a, b, c, d, e);
		// 소스코드 만줄
		r2 = clacformula1(10, 20, 5, 30, 2);
		// 소스코드 천줄
		r3 = clacformula1(a, b, c, d, e);
		// 소스코드 이천줄
		r4 =clacformula1(a, b, c, d, e);
				
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	
}
}
