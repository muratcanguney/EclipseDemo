package Interfaces;

import Entities.User;

public abstract class BaseUserManager implements UserService {
	
	private UserCheckService userCheckService;
	
	public BaseUserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void save(User user) {
		if (userCheckService.checkIfRealPerson(user)) {
		System.out.println(user.getUserName() + " -- " + " Kullanýcýsý Sisteme Kayýt Edildi..");
		} else {
			System.out.println("Kimlik Doðrulamasý Yapýlamadýðý Ýçin Kullanýcý Kayýt Edilemedi.");
		}
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUserName() + " -- " + " Kullanýcý Kaydý Güncellendi..");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName() + " -- " + " Kullanýcý Kaydý Silindi..");
	}
}
