package j06_반복;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		
		 while(true) {
			 char select = 0;
			 
			System.out.println("[ 메뉴 선택 ]");
			System.out.println("1. java");
			System.out.println("2. phthon");
			System.out.println("3. javascript");
			System.out.println("q. 프로그램종료");
			 
			System.out.print("명령을 입력하세요: ");
			select = scanner.next().charAt(0); // a b c
			String str = scanner.nextLine();
			System.out.println(select);
			System.out.println(str); 
			
			if(select == 'q') {
				break;
			}else if (select == '1') {
				System.out.println("java를 선택하셨습니다.");
				System.out.print("계속하시려면 엔터를 눌러주세요.");
				scanner.nextLine();
					//nextline을 통해 입력을 기다리는 동안 반복을 중단할 수 있음.
							
		 	}else if(select == '2') {
		 		System.out.println("phython을 선택하셨습니다.");
		 		System.out.print("계속하시려면 엔터를 눌러주세요.");
				scanner.nextLine();
			}else if(select == '3') {
				System.out.println("javascript를 선택하셨습니다.");
		 		System.out.print("계속하시려면 엔터를 눌러주세요.");
				scanner.nextLine();
				
			}else {
				System.out.println("해당 명령은 보기에 없습니다.");
				System.out.println("다시 입력하세요.");	
				
			 }	 
			 System.out.println();{
		}
			 
		 System.out.println("프로그램 종료");
	}
	
  }
}

	
