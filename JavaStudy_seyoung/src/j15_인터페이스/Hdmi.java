package j15_인터페이스;

/*
 * 인터페이스(Interface)
 *  - 클래스와 클래스를 연결 할 때 인터페이스(규격)가 같아야 연결이 가능함.
 *  - 기본적으로 모든 메소드는 추상 메소드이다.
 *  - 일반 메소드를 사용하고 싶다면 return type 앞에 default 키워드를 사용하여야 한다.
 *  
 * 약속 
 * 
 */

public interface Hdmi {
	public void connect()
	;	
	public void disconnect(); // <-> abstract 클래스와 정반대인 클래스
	void vgaConnect();
	}
	

