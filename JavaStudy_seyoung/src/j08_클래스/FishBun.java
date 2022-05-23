package j08_클래스;

	/* 클래스는 틀이다. 틀을 가지고 instance를 찍어낼 수 있다. 
	 * 클래스명은 무조건 대문자로 시작하여야 한다.
	 * 클래스도 자료형임 (참조자료형) 
	 * 클래스 = 변수 + 메소드
	 * material, dough -> 변수
	 * void showInfo => 메소드
	 * class에 들어오고 나서는 static 쓰면 안됨(배우기 전까지)
	 * public은 캡슐화 들어오고 나서쓸꺼임 쓰지 마삼
	 * 모든 클래스는 생성자가 숨어있다.
	 * 반환자료형이 없다
	 * 대문자로 쓴다 (메소드는 무조건 소문자로 시작하여야함)
	 * 
	 */

public class FishBun {
	String material; 
	String dough; 
	
	FishBun(){ //생성자
		System.out.println("생성자 호출");
	}
	
	void showInfo() {
		System.out.println("재료: " + material);
		System.out.println("반죽: " + dough);
	
	}

}	
