package nLayeredDemoHW.dataAccess.abstracts;

import java.util.List;

import nLayeredDemoHW.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	List<User> getAll();
}
