package j06_반복;

public class While02 {

	public static void main(String[] args) {
		
		//구구단 2단 출력
		/*
		 * 2 * 1 = 
		 * 2 * 2 = 
		 * 2 * 3 = 
		 * .... = 
		 * 2 * 9 =  
		 */
		
		int dan = 2;
		int num = 0;
		
		while (num < 9) {
			System.out.println(dan + "X" + (num + 1) + "=" + (dan * (num + 1)));
			num++;
			
		}
	}
}
