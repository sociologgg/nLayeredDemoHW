package nLayeredDemoHW.Google.concretes;


import nLayeredDemoHW.entities.concretes.User;

public class GoogleUserManager{

	public void add(User user) {
			System.out.println(user.getFirstName() + " " +user.getLastName() + " Registered by Google");
	}

		
}
