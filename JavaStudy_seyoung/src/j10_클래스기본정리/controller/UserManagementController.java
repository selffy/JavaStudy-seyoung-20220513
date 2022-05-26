package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {
	private UserService userService;
	private User[] users;
	
	//userService를 다른 곳에 공유하면 안되기 때문에 private

	//다른 클래스에서 써야한다면 get을 이용
	//무조건 클래스 내 변수는 다private임
	// 
	
	
	public UserManagementController(UserService userSerivce){
		this.userService = userSerivce;
		users = new User[2];
	}
	
	 public void createuser() {
		 int indexResult = findEmptyUsers();
		 if(indexResult != -1) {
		 users[indexResult] = userService.insertUser();
		 
		 System.out.println("[새로 추가된 사용자]");
		 System.out.println(users[indexResult].toString());
		 } else {
		 System.out.println("더 이상 사용자를 추가할 수 없습니다.");
	 	}
	 }
		 
	 
	 private int findEmptyUsers() {
		 for(int i = 0; i < users.length; i++) {
			 if(users[i] == null) {
				 return i;
			 }
		 }
		 return -1;
	 }
	 
	
	 public void upaderUser() {
		 
	 }
	 


}