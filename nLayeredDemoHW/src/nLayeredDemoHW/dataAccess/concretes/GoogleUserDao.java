package nLayeredDemoHW.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemoHW.Google.concretes.GoogleUserManager;
import nLayeredDemoHW.core.concretes.GoogleServiceAdapter;
import nLayeredDemoHW.dataAccess.abstracts.UserDao;
import nLayeredDemoHW.entities.concretes.User;

public class GoogleUserDao implements UserDao {
	
	 List<User> users = new ArrayList<User>();
	

	@Override
	public void add(User user) {
		GoogleServiceAdapter manager = new GoogleServiceAdapter();
		manager.addToDatabase(user);
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
