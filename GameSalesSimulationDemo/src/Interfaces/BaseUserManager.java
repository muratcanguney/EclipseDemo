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
		System.out.println(user.getUserName() + " -- " + " Kullan�c�s� Sisteme Kay�t Edildi..");
		} else {
			System.out.println("Kimlik Do�rulamas� Yap�lamad��� ��in Kullan�c� Kay�t Edilemedi.");
		}
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUserName() + " -- " + " Kullan�c� Kayd� G�ncellendi..");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName() + " -- " + " Kullan�c� Kayd� Silindi..");
	}
}
