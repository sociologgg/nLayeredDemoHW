package nLayeredDemoHW.core.abstracts;

import java.util.List;

import nLayeredDemoHW.dataAccess.abstracts.UserDao;
import nLayeredDemoHW.entities.concretes.User;

public interface UserCheckService {
	boolean checkPassword(User user);
	boolean checkName(User user);
	boolean checkEmail(User user);
	boolean checkEmailFromDatabase(User user, UserDao userDao);
	boolean checkCode();
	
	
	
}
