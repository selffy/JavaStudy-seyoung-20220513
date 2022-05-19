package j06_반복;

public class Star {

	public static void main(String[] args) {
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ******
		 */
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
			System.out.print("*");
			}
			System.out.println();
					
		}		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
				System.out.println("*");
			}
		}
	
	
	/* 숙제 (실화야?)
	 *     * - 스페이스 4 / 별 1
	 *    ** - 스페이스 3 / 별 2
	 *   *** - 스페이스 2 / 별 3
	 *  **** - 스페이스 1 / 별 4
	 * ***** - 스페이스 0 / 별 5
	 * 
	 * *****
	 *  ****
	 *   ***
	 *    **
	 *     *
	 *     
	 *     *
	 *    ***
	 *   *****
	 *  *******
	 * *********     
	 */
	
	
	
}
