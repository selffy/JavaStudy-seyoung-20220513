package j23_예외처리;

public class Throws01Main {

	public void test() throws Exception {
		Throw01 throws01 = new Throw01();
		
		throws01.printArray(new int[] {1,2,3,4,5,6,7,8,9});
	}
	
	public static void main(String[] args) {
		Throws01Main main = new Throws01Main();
		
		try {
			main.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();   //어디까지 에러가 연쇄되었는지 같이 표기됨.
//			System.out.println(e); //그냥 에러메세지만 뜸.
		}
		
		System.out.println("프로그램 종료");
	}

}
