package j11_배열;

//자료형 : 일반자료형, 참조자료형(class), 배열자료형 (ex)[] 
										//(배열도 클래스임)

public class Array01 {

	public static void main(String[] args) {		
		 // 1은 절대 변하지 않는 값임. 
		 //반복문을 쓰기 위해 배열 사용
		
		//1. 배열의 공간(크기)을 정해서 생성
		System.out.println();
		
		int[] numbers = new int[10];  // int[10]: 4바이트 int자료형을 10개 모아서 주소를 만든다는 의미
		
		//2. 배열에 들어갈 값을 미리 정해서 생성
		
		int[] numbers2 = {1,2,3,4,5,6,7,8,9,10};
		char[] characters = {'a', 'b' , 'c', 'd', 'e'};
		boolean[] booleans = {true, true, true, false, false};

		String[] strArray = new String[5];  //String의 기본값 :  null => 주소의 첫번째 값(즉 0번째 주솟값)
		String str = "test"; //문자열의 리터럴 주소는 클래스의 형태가 바로 String이다.
		
		System.out.println("numbers의 길이: " + numbers.length);
		System.out.println("strArray의 길이: " + strArray.length);
		
		
		for(int i = 0; i< numbers.length; i++) {
								//length: 해당 배열의 크기를 가지고 와줌
			System.out.println("i: " + i);
			System.out.println("numbers: " + numbers[i]); 
			System.out.println("numbers: " + numbers2[i]);
		}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
	//배열자료형	//(=생성)
		numbers[0] = 10;
		numbers[1] = 20;
		System.out.println(numbers[0]); //배열의 위치
	}
}
