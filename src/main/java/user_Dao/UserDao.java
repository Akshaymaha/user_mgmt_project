package user_Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import user_Dto.User;

public class UserDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction et = manager.getTransaction();
	
	public void insertUser(User user) {
		et.begin();
		manager.persist(user);
		et.commit();
	}
	public User getUserById(int id) {
		User user = manager.find(User.class, id);
		return user;
	}
	public List<User> getAllUsers(){
		javax.persistence.Query q = manager.createQuery("SELECT u FROM User u",User.class);
		List<User> user = q.getResultList();
		return user;
	}
	public void DeleteUser(int id) {
		User user = manager.find(User.class, id);
		if(user!=null) {
			et.begin();
			manager.remove(user);
			et.commit();
		}
		else {
			System.out.println("User id does not exists...");
		}
		
	}
	public void updateUser(User user) {
		et.begin();
		manager.merge(user);
		et.commit();
		System.out.println("User Datails updated...");
	}
	public List<User> getUserByEmailPw(String Email,int pwd){
		javax.persistence.Query q = manager.createQuery("SELECT u FROM User u where u.Email =?1 and u.password =?2");
		q.setParameter(1, Email);
		q.setParameter(2, pwd);
		List<User> lt = q.getResultList();
		return lt;
	}

}
