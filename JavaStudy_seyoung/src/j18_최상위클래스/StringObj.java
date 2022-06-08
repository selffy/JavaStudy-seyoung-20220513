package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {

	public static void main(String[] args) {
		String name = "김준일";
		String name2 = "김준일";
		
		System.out.println(name == name2);
		
		//주소가 같은 이유: "김준일" 자체가 리터럴값임. 동일한 주소를 가져다 쓰는 것.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름1: ");
		name = scanner.nextLine();
		System.out.print("이름2: ");
		name2 = scanner.nextLine();
		
		System.out.println(name == name2);
		
		//false가 나오는 이유: 새로 생성이 되었기에 주소가 다름.
		
		name = new String("김준일");
		name2 = new String("김준일");
		
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		
		//equals -> name이랑 name2랑 같냐는 말임. 값을 비교함.
		
	}	
}
