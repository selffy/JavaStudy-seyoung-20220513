package j17_스태틱;

public class Main {

	public static void main(String[] args) {
		
		Test t = new Test();
		Test t2 = new Test();
		Test t3 = new Test();

		t.count = 10;
		t2.count = 20;
		t3.count = 30;

		t.method();
		t2.method();
		t3.method();
				
		StaticTest st = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		
		st.count = 10;
		st2.count = 20;
		st3.count = 30;
		
		StaticTest.count = 100;
		
		st.staticMethod();
		st2.staticMethod();
		st3.staticMethod();

		StaticTest.staticMethod();
		
		// static은 복제되지 않고 클래스 안에 정의됨. 
		// 애초에 클래스 안에 존재하기 때문에 생성하지 않아도 클래스 안에 값이 저장되어 사용됨. 
		// 생성과 전혀 상관이 없음.
		// 스테틱은 제일 마지막에 넣은 값으로 다 공유 된다고 볼 수 있음.
		// 글자가 누워있는 친구들이 static임
		// 변수와 메소드에만 사용 가능함.
	}
	
}
