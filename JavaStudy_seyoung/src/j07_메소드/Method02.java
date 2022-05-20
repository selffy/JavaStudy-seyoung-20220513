package j07_메소드;

/*클래스 안에 정의된 함수를 메소드라고 한다.
 *자바에서 모든 함수는 메소드이다.
 *자바스크립트는 클래스 단위도 있지만 클래스 단위 바깥도 있다. 
*/
public class Method02 {
	
	//매개변수가 없으면서 반환도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 실행");
	}
	
	// 매개변수는 있고 반환이 없는 메소드
	
	public static void test2(int age, int year) { //괄호 안에 있는 변수 = 매개 변수
 		System.out.println("나이: " + age);
		System.out.println("출생년도: " + year);
	}
	
	// 반환이 없다라는 것은 "void"라는 용어가 들어감
	// void = 공허한, 즉 return 할 것이 없다라는 의미임.
	
	
	
	// 매개변수가 없고 반환이 있는 메소드
		// 매개변수가 없으면 괄호 안에 넣을 것이 없음.
		// test3는 출력할 것이 없음. 
		// return = 반환
		// test3는 값이기 때문에 변수에 담을 수도 있다.
		// string을 적은 이유는 return 때 string을 return하였기 때문에 작성함.
	
	
	public static String test3() {  // string => class : 클래스도 반환할 수 있다
		return "셀피";
	}
	
	public static int test4() {   // int => 일반 자료형
		return 10000;
	}
	
	// 매개변수도 있고 반환도 있는 메소드
	
	public static String test5(String name, int num) {
		return name + num;
	}
	
	// 리턴자료형이 void일 때 메소드를 강제로 탈출하는 방법
	
	
	// break는 메소드를 멈추는 것이 아닌 반복을 멈추는 것임.
	// return은 어느 위치에서든지 호출 할 수 있음. return 뒤에는 실행할 수 없음.
	
	
	public static void test6() {
		for(int i = 0; i <10; i++) {

			System.out.println(i);
			if(i==6) {
				System.out.println("메소드 탈출");
				return;
			}
		}
	}
	
	public static void main(String[] args) {	
		System.out.println("메인함수 시작"); 
		test1(); //호출
		test2(27, 1996);
		String name = test3();
		System.out.println(name);
		System.out.println(test3());
		System.out.println(test5("셀피", 1));
		test6();
		System.out.println("메인함수 끝");
		
	}
	
	
	
}
