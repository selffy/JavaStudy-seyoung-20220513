package j14_추상;

/*
 * abstract(추상)
 * 
 * 추상 메소드
 * 1. return type 앞에 abstract 키워드가 붙는다.
 * 2. 추상 메소드는 일반 클래스 안에 선언할 수 없다. 
 * 3. 상속 또는 구현된 클래스에서 무조건 override(재정의)가 되어야한다.
 * 4. 상위 클래스에서 추상 메소드는 바디가 없기 때문에 하위 클래스에서 바디가 작성 되어야 함.
 * 
 * 추상클래스
 * 1. 클래스 type 앞에 abstract 키워드가 붙는다.
 * 2. 추상 클래스는 생성할 수 없다.
 * 3. 추상 메소드를 포함 할 수 있다. 하지만 추상 메소드를 꼭 포함하지는 않아도 된다.
 * 
 * 
 */


//추상 클래스(abstract class)
public abstract class Factory {
	
	//추상 메소드
	public abstract void start();
	//abstract는 중괄호를 쓰지 않고 세미클론으로 끝냄.
	
	//일반 메소드
	public void stop() {
		System.out.println("공장을 멈춥니다.");
	}
	
}


