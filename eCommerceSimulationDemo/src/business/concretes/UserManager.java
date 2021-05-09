package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import business.validations.UserValidator;
import core.MailService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	UserDao userDao;
	MailService mailService;

	public UserManager(UserDao userDao, MailService mailService) {
		this.userDao = userDao;
		this.mailService = mailService;
	}

	@Override
	public void register(User user) {
		if (UserValidator.userValid(user)) {
			this.userDao.add(user);
		}
	}

	@Override
	public void login(String email, String password) {
		if (email != null && password != null) {
			System.out.println(email + " *** " + "Sisteme Giri� Yap�ld�..");
		} else {
			System.out.println("E-Mail Adresi veya �ifre Bo� Ge�ilemez..");
		}
	}

	@Override
	public void gmailLogin(String email) {
		if(mailService.checkMail(email)) {
			System.out.println(email + " Adresi ile Giri� Yap�ld�.. -- GMail Entegrasyonu");
		} else {
			System.out.println(email + " Adresi GMaile Kay�tl� De�ildir.. -- GMail Entegrasyonu");
		}

	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}
}
