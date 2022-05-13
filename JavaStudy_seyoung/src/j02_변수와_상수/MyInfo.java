package j02_변수와_상수;


public class MyInfo {
	public static void main(String[] args) {
		// 주석이란: 
		 /*
		  *메모, 필기
		  *
		  *1. 문제 
		  *name1, name2, name3
		  *age(나이)
		  * phone(연락처)
		  * address(주소)
		  */
	 
		char name1 = '이';
		char name2 = '세';
		char name3 = '영';
		int age = 27;
		String phone = "010-5233-8950";
		String address = "부산진구 가야대로 450";
	
		//String: 문자열(하나의 문자 이상이 합쳐진 것)을 담을 수 있는 변수, 문자열은 큰따옴표, 문자는 작은따옴표로 감싸줘야함.
		
		System.out.println("이름: " + name1+ name2 + name3);
		
		System.out.print("나이: "+ age);
		
		System.out.println("연락처: "+ phone);
		
		System.out.println("주소: "+ address);        
	
		// 한줄로 쓸 수 있는 방법
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3);// 16진수 AC01 -> 10진수
	 
		System.out.println("세수의 합: " + (10+20+30));
		
		
	}
}
