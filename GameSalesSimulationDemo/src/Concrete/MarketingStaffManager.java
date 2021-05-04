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
		System.out.println(user.getUserName() + " -- " + " Satýþ Personeli Sisteme Kayýt Edildi..");
		} else {
			System.out.println("Kimlik Doðrulamasý Yapýlamadýðý Ýçin Satýþ Personeli Kayýt Edilemedi.");
		}
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUserName() + " -- " + " Satýþ Personeli Kaydý Güncellendi..");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName() + " -- " + " Satýþ Personeli Kaydý Silindi..");
	}
}
