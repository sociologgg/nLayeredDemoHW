package nLayeredDemoHW.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemoHW.dataAccess.abstracts.UserDao;
import nLayeredDemoHW.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	 List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " +user.getLastName() + " Hibernate ile eklendi!"); 
		users.add(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}
	
	
}
