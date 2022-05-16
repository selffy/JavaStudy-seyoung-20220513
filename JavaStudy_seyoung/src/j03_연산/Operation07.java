package j03_연산;

public class Operation07 {

public static void main(String[] args) {
	
	
	/* 
	 * 4의 배수 이면서 100의 배수가 아니거나 400의 배수 인것
	 */
	int year = 2000;
	
	String result = null;
	
	System.out.println("결과: " + result);
	
	String result1 = year % 4 == 0
			&& year % 100 != 0 
			|| year % 400 == 0? "윤년" : "윤년이 아님";
	
	System.out.println("결과: " + result1);
	
		
	
}	
	
}
