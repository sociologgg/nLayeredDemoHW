package nLayeredDemoHW.core.concretes;

import nLayeredDemoHW.core.abstracts.UserCheckService;
import nLayeredDemoHW.dataAccess.abstracts.UserDao;
import nLayeredDemoHW.entities.concretes.User;

import java.util.regex.Pattern;

import java.util.List;

public class UserCheckManager implements UserCheckService {

		private final String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	@Override
	public boolean checkPassword(User user) {
		// Password length has to be 6 in its minimum value.  
		if (user.getPassword().length() >= 6) {
			
			return true;
			}else {
				System.out.println("Your password length has to be 6 at its minimum value!");
				return false;}
	}

	@Override
	public boolean checkName(User user) {
		// First and Last name's lengths have to be longer than 2 at theirs minimum values !
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2) {
			return true;
		} else {
			System.out.println("Your First and Last names are invalid! (At least 2 characters!)");
			return false;}
		
	}

	@Override
	public boolean checkEmail(User user) {
		// Check if mail is valid.
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		
		if (pattern.matcher(user.getMail()).find()) {
			return true;
		}else {
			System.out.println("Check your email format!");
			return false;
		}
			
		
		
	}

	@Override
	public boolean checkEmailFromDatabase(User user, UserDao userDao) {
		// Check if the user was registered before.
		List <User> dataBase = userDao.getAll();
		
		
		
		for (User newUser : dataBase) {
			
				 if (newUser.getMail() == user.getMail()) {
				System.out.println("This e-mail was registered before!!");
				return false;
				
			}
				
			} return true;
		
	}

	@Override
	public boolean checkCode() {
		System.out.println("Verification code has been sent!");
		System.out.println("Verification is successfully completed!");
		return true;
	}
	
	
	

}
