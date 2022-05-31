package j17_스태틱.싱글톤;

import java.util.stream.IntStream;

/*
 * 1. 생성자는 private으로 지정하여 외부에서 생성할 수 없게 만들어야 한다.
 * 2. 싱글톤으로 설계된 클래스의 유일한 인스턴스를 return해줄 수 있는 getInstance()	static 메소드가 존재해야 한다.
 * 3. 싱글톤 instance를 저장할 변수명이 instance인 static 변수가 존재해야 한다.
 */


public class Singleton {
	private static Singleton instance = new Singleton();
	private int count;
	public Singleton() {}
	
	public static Singleton getInstance() {  
		//싱글톤의 생성자는 무조건 private : 유일한 객체이기 때문에 외부에서 누구도 생성할 수 없음.
		//스테틱 메소드에서 일반 메소드를 사용할 수 없음. 스테틱 변수는 생성되지 않아도 사용할 수 있기 때문.
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printInfo() {
		System.out.println("싱글톤 테스트" + count);
	}
		
}