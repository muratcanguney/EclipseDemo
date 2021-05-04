package Concrete;

import Entities.User;
import Interfaces.BaseUserManager;
import Interfaces.UserCheckService;

public class MarketingStaffManager extends BaseUserManager {
	
	UserCheckService userCheckService;

	public MarketingStaffManager(UserCheckService userCheckService) {
		super(userCheckService);
		this.userCheckService = userCheckService;
	}

	@Override
	public void save(User user) {
		if (userCheckService.checkIfRealPerson(user)) {
		System.out.println(user.getUserName() + " -- " + " Sat�� Personeli Sisteme Kay�t Edildi..");
		} else {
			System.out.println("Kimlik Do�rulamas� Yap�lamad��� ��in Sat�� Personeli Kay�t Edilemedi.");
		}
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUserName() + " -- " + " Sat�� Personeli Kayd� G�ncellendi..");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName() + " -- " + " Sat�� Personeli Kayd� Silindi..");
	}
}
