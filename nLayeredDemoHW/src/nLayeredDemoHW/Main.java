package nLayeredDemoHW;

import nLayeredDemoHW.business.abstracts.UserManagerService;
import nLayeredDemoHW.business.concretes.UserManager;
import nLayeredDemoHW.core.concretes.UserCheckManager;
import nLayeredDemoHW.dataAccess.concretes.GoogleUserDao;
import nLayeredDemoHW.dataAccess.concretes.HibernateUserDao;
import nLayeredDemoHW.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User userHibernateValid = new User("Alim","Örnek","alimornek1458@gmail.com", "12345678");
		User userHibernateInvalid = new User("Engin","Demiroğ","alimornek1458@gmail.com","123132131");
		User user2HibernateInvalid = new User("Paul","Chomsky","paul@hotmail.com","21");
		User GoogleUser = new User("İnce","Mehmet","incememet@gmail.com","313213131");
		User GoogleUser1 = new User("İnce","Mehmet","incememet@gmail.com","313213131");
		
		
		UserManagerService userManagerServiceHibernate = new UserManager(new HibernateUserDao(),new UserCheckManager());
		UserManagerService userManagerServiceGoogle = new UserManager(new GoogleUserDao(),new UserCheckManager());
	
		
		userManagerServiceHibernate.add(userHibernateValid);
		userManagerServiceHibernate.add(userHibernateInvalid);
		userManagerServiceHibernate.add(user2HibernateInvalid);
		userManagerServiceGoogle.add(GoogleUser);
		userManagerServiceGoogle.add(GoogleUser1);
		
		
		
		
		userManagerServiceHibernate.login(userHibernateValid);
		
		
		
		// TODO Auto-generated method stub
			
			
	}

}
