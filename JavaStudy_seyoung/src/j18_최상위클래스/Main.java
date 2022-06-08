package j18_최상위클래스;

public class Main {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("김준일", "웹개발");
		Teacher t2 = new Teacher("김준일", "웹개발");
		
		//업캐스팅 가능 => Object로 상속 또는 구현이 되었다.
		//최상위클래스이기 때문에 어떤 클래스든 간에 업캐스팅이 가능함.
		
		System.out.println(t1.toString()); 
		System.out.println(t2); //toStirng은 생략이 가능하다. 생략해도 같은 값이 출력됨.
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
		//String은 equals 했을 때 true가 나오는데 그 이유는 object안에 overriding되어있어 값을 비교할 수 있게끔 재정의됨.
		System.out.println(t1.hashCode() == t2.hashCode());
		
	
	}

}
	

