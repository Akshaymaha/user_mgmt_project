package user_mgmt_project_userController;

import java.util.Scanner;

import user_Dao.UserDao;
import user_Dto.User;

public class UpdateUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to Update");
		int id = sc.nextInt();
		
		User u = new User();
		UserDao deo = new UserDao();
		System.out.println("---------update---------");
		System.out.println("1. update name \n2.update email_id \3.update address \n4 update password \nenter your choice..... ");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:{
			System.out.println("Enter the new name");
			String name = sc.next();
			u.setName(name);
			deo.updateUser(u);
			break;
		}
		case 2:{
			System.out.println("Enter the new email_id");
			String email = sc.next();
			u.setEmail(email);
			deo.updateUser(u);
			break;
		}
		case 3:{
			System.out.println("update the address");
			String address = sc.next();
			u.setAddress(address);
			deo.updateUser(u);
			break;
		}
		case 4:{
			System.out.println("update your password");
			int password = sc.nextInt();
			u.setPassword(password);
			deo.updateUser(u);
			break;
		}
		default : System.out.println("Invalid choice");
		}
	}

}
