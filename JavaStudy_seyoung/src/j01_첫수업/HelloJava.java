package j01_첫수업;

public class HelloJava {

	public static void main(String[] args) {

		System.out.print("Hello, Java"); // 줄바꿈 안해줌
		System.out.println("Hello, Java");	// 출력 후 줄바꿈을 해줌
//		"ln" 줄바꿈 역할
		System.out.print(10 + 5);
		System.out.println();
// 괄호에 들어 있는 것을 출력하는 것
// ""안에 묶어 있을 경우 문자가 출력 됨
// ""가 없을 경우 수식 계산
//		줄을 바꾸라는 명령
		
		System.out.print("이름: ");
		System.out.println("셀피");
		System.out.print("직업: ");
		System.out.println("취준생");
		System.out.print("나이: ");
		System.out.println(27);
		
		int age = 27;
	
		System.out.print("이름: ");
		System.out.println("셀피");
		System.out.print("직업: ");
		System.out.println("취준생");
		System.out.print("나이: ");
		System.out.println(age);

		
		age = age + 2;
		
			
		
		
		
		// 숫자 값은 "" 없이 써야 함. 
		// 변수란? 말 그대로 변하는 수
		// 변수: 자료형 + 변수명
		// 변수명 제약사항: 변수이름은 영문자나 숫자를 사용할 수 있고 구분하며 특수문자 중에는 $, _만 사용할 수 있다
							// 변수 이름은 숫자로 시작할 수 없다
							// 자바에서 이미 사용 중인 예약어는 사용할 수 없다

			//	자료형 g_Level;(o)
		 	//  자료형 27day(X)
		
		// 카멜 표기법: 단어의 시작 문자를 대문자로 씀 예)myName
		// 헝가리안 표기법: 변수의 자료형을 접두어에 붙이는 표기법0 예)c_key, l_data, n_input
		// 선언(이렇게 쓸 것이다 선언)과 초기화
		// int(자료형) level(변수명);
		// level = 10; -> 초기화 작업
		// int level = 10;
		// 변수는 컴퓨터 내부의 메모리 공간에 저장된다
		//	컴퓨터에서 수를 표현하는 법 
		// 10진수 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		// 2진수  0000 0001 0010 0011 0100 0101 0110 0111 1000
		// 8진수  0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20 21 22 23
		// 16진수 0 1 2 3 4 5 6 7 8 9 A	B C D E F 10 11 12 --- 19 1A 1B
		//1. 비트(Bit): 0과 1의 값을 저장하기 위한 최소 단위
		//1비트가 가지는 총 경우의 수는 0과 1, 두 가지이다.
		// 2. 바이트(byte) 9bit를 한 단위로 표준화한 용량 단위 ,- 바이트를 통해 자료형 크기 계산
		// 1byte가 나타낼 수 있는 총 경우의 수 (00000000 ~ 11111111) - 256개		
	
		//1byte=256가지 2byte=(256)의 제곱
		
		// \u0000 (유니코드)
		System.out.println("\uAC01"); 	
		
		
		// Boolean(1bit) char(2byte) int(4byte) double(8byte)
		
		
		// 정수 자료형 long num = 12345678900l
		   // 아스키 코드 'A'==65
		// 실수 자료형 Float -> float fnum
		// 논리 자료형 True of False 
		// 상수(항상 변하지 않는 값) Final double PI =3.14
	}

}

