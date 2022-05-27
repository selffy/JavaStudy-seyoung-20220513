package j12_상속.동물;

public class Human extends Animal {
	
	/*
	 * @ : 어노테이션
	 * 
	 * @override(재정의) : 부모가 가지고 있는 메소드들 자식대에서 자식에 맞게끔 재정의 하겠다.
	 * 					   즉, 상위 클래스 또는 인터페이스가 가지고 있는 메소드를 재정의 하겠다는 의미.
	 */
	
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	// 부모가 가지고 있는 메소드를 자식 클래스에 사용하였음.
	//  
	
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
