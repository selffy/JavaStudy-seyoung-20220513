package j03_연산;


/* 조건 연산자
 *  조건식? 결과1 : 결과 2
 *  조건식이 참이면 결과 1을 반환, 거짓이면 결과2를 반환
 *  간단한 조건부를 삼항연산자로 대체할 수 있음
 *  CPU는 연산처리를 하기 위한 장치
 *  
 *  복사붙여넣기 ctrl + alt + 위 또는 아래
 *  단축키 도움말 ctrl + shift + l
 *  
 */ 

public class Operation06 {

	public static void main(String[] args) {
		
		int num = 80;
		
		String result = num % 4 == 0 ? "4의 배수" : "4의 배수가 아님";
		boolean result2 = num % 4 == 0 ? true : false ;
		int result3 = num % 4 == 0 ? 1 : 0 ;

		System.out.println(result);
		
		
	
		
		
		
		
		
	}
}
