package j05_조건;

public class SwitchCase {

	public static void main(String[] args) {
	
		int num = 29;
		char a = 'c';
		String str = "셀피";
		
		switch(num / 10 ) { //케이스에서 찾고자 하는 값
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
			default: 
				System.out.println("찾을 수 없음");
		
		switch(a) {
			case 'a':
				System.out.println("case a");
				break;
			case 'b':
				System.out.println("case b");
				break;
			case 'c':
				System.out.println("case c");
				break;
			default: 
				System.out.println("찾을 수 없음");
		}
		switch(str) {
			case "셀피":
				System.out.println("case 셀피");
				break; 
			case "지니":
				System.out.println("case 지니");
				break;
			case "김지":
				System.out.println("case 김지");
				break;
			default: 
				System.out.println("찾을 수 없음");
		}
		
	
		}
	}
}
		
		