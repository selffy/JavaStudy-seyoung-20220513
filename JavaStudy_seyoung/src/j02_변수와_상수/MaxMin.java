package j02_변수와_상수;

public class MaxMin {

	public static void main(String[] args) {
		
		// 상수: 항상 변하지 않는 값
		// 리터럴 상수: 이미 정해져 있는 상수
		
		final int MAX_NUMBER;
		MAX_NUMBER = 100;
		final int MIN_NUMBER;
		MIN_NUMBER = 10;
	
		
		final String PATH = "C:\\junil\\workspace";
		
	    final double PI = 3.14;
	    	
			
		
		// 상수라고 표기하기 위해 대문자로 작성
		
		// 변수는 무조건 소문자
		// 대문자로 시작하는 것은 클래스
		// 전부다 대문자로 작성하는 것은 상수!!!
		
		
		System.out.println(MAX_NUMBER);
		System.out.println(MIN_NUMBER);
		
		// 형변환 [업캐스팅, 다운캐스팅]
		
		/* 업캐스팅 : 문자->정수->실수 (값이 작은 범위에서 큰 범위로의 형 변환/ 묵시적 형 변환-형 변환 타입 생략 가능)
		 * 다운캐스팅: 실수->정수->문자 (값이 킅 범위에서 작은 범위로의형 변환/ 명시적 형 변환-형 변환 타입 생략 불가능)
		 */
				
		System.out.println(PI);
		
		
	}
	
}
