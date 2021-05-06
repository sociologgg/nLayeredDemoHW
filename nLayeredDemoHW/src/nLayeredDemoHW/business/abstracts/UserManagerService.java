package nLayeredDemoHW.business.abstracts;

import java.util.List;

import nLayeredDemoHW.entities.concretes.User;
import nLayeredDemoHW.dataAccess.abstracts.UserDao;

public interface UserManagerService {
	void add(User user);
	void delete(User user);
	List<User> getAll();
	boolean login(User user);
}
