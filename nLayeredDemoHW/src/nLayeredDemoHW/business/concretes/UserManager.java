package nLayeredDemoHW.business.concretes;

import java.util.List;

import nLayeredDemoHW.business.abstracts.UserManagerService;
import nLayeredDemoHW.core.abstracts.UserCheckService;
import nLayeredDemoHW.dataAccess.abstracts.UserDao;
import nLayeredDemoHW.entities.concretes.User;

public class UserManager implements UserManagerService {

	UserDao userDao;
	UserCheckService userCheckService;
	
	public UserManager(UserDao userDao, UserCheckService userCheckService) {
		this.userDao = userDao;
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if (userCheckService.checkEmail(user) && userCheckService.checkName(user) 
				&& userCheckService.checkPassword(user) &&  userCheckService.checkEmailFromDatabase(user, userDao) &&
				 userCheckService.checkCode()) {
			
			userDao.add(user);
			
			
		}else {
			System.out.println("Check your information! ");
			
			
		}
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	@Override
	public boolean login(User user) {
		// Check the user's information in database.
		for (User mail : getAll()) {
			if(mail.getMail() == user.getMail() && mail.getPassword() == user.getPassword()) {
				System.out.println("Successfull login, welcome! " + user.getFirstName() + " " + user.getLastName());
				return true;
			}
				
			}
		System.out.println("Invalid email or password!");
		return false;
		}
		
		
	}
	
	
	

