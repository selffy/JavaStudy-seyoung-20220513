package j06_반복;

public class GuGuDan {

	
	public static void main(String[] args) {
		
		/*
		 * 구구단 2단부터 9단까지
		 * 
		 * 2 * 1 
		 * 2 * 2
		 * 2 * n
		 * n = n+1
		 * n >10, 2+1
		 */
		
		
		for(int i = 2; i < 10; i++ ) {
			for(int n = 1; n < 10; n++) {
			System.out.println(i + "X" + n + "=" + (i * n));
			}
		
}
		for(int dan = 0; dan < 8; dan++ ) {
			System.out.println((dan + 2) + "단");
			for(int i = 0; i < 9; i++) {
				int result = ((dan + 2) * (i + 1));
				System.out.println((dan + 2) + "X" + (i + 1) + "=" + result);
			}
		}
		System.out.println();
}
}