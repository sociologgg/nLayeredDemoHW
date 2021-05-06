package nLayeredDemoHW.core.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemoHW.Google.concretes.GoogleUserManager;
import nLayeredDemoHW.core.abstracts.OwnGoogleService;

import nLayeredDemoHW.entities.concretes.User;

public class GoogleServiceAdapter implements OwnGoogleService {

	@Override
	public void addToDatabase(User user) {
		GoogleUserManager manager = new GoogleUserManager();
		manager.add(user);
		
	}

	
	
	
	}
	

