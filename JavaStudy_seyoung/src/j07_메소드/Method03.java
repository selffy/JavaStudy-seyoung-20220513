package j07_메소드;

//메소드 오버로딩
//메소드명은 똑같이 쓸 수 없다. 하지만 오버로딩을 사용하면 똑같은 메소드명을 사용할 수 있다.
//매개변수가 하나더라도 자료형이 다르면 가능
//매개변수는 순서가 중요하다
//숙제: 메뉴를 함수화 시켜서 프로그램 만들어오기

public class Method03 {

	public static void test1() {
		System.out.println("매개변수가 없는 test1 호출");	
	}

	public static void test1(int num) {
		System.out.println("int자료형 매개변수가 하나인 test1 호출");
	}
	
	public static void test1(int num, int num2) {
		System.out.println("int자료형 매개변수가 둘인 test1 호출");
	}

	public static void test1(double a) {
		System.out.println("double자료형 매개변수가 둘인 test1 호출");
	}
	
	
	public static void test1(int num, double dnum) {
		System.out.println("int자료형 다음에 double자료형 매개변수가 둘인 test1 호출");
	}
	
	public static void test1(double num, int dnum) {
		System.out.println("double자료형 다음에 int자료형 매개변수가 둘인 test1 호출");
	}
	
	
		public static void main(String[] args) {	
			test1();
			test1(10);
			test1(10, 20);
			test1(3.14);
			test1(10, 3.14);
			test1(3.14, 10);
			
	}
}
