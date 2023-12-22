package user_mgmt_project_userController;

import java.util.Scanner;

import user_Dao.UserDao;
import user_Dto.User;

public class InsertController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====USER_MGMT_SYSTEM=====");
		System.out.println("Enter the user id");
		int id = sc.nextInt();
		System.out.println("Enter user name");
		String name = sc.next();
		System.out.println("enter email address");
		String email = sc.next();
		System.out.println("enter your password");
		int pass = sc.nextInt();
		System.out.println("enter your address");
		String add = sc.next();
		
		User u = new User();
		u.setId(id);
		u.setName(name);
		u.setEmail(email);
		u.setPassword(pass);
		u.setAddress(add);
		
		UserDao user = new UserDao();
		user.insertUser(u);
		System.out.println("User Details are added successfully..");
		
		
	}

}
