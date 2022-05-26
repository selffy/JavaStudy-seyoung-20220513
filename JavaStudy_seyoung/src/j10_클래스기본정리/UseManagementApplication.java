package j10_클래스기본정리;

import j10_클래스기본정리.controller.UserManagementController;
import j10_클래스기본정리.service.UserService;  //ctril+shift+o

public class UseManagementApplication {
	
	public static void main(String[] args) {

		UserManagementController userManagementController = new UserManagementController(new UserService());
		userManagementController.createuser();
		userManagementController.createuser();
		userManagementController.createuser();
		
		
	}

}
