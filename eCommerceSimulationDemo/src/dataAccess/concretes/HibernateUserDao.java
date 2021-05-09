package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	public List<User> users = new ArrayList<>();

	@Override
	public void add(User user) {

		System.out.println("Kullanýcý Kaydýnýz Oluþturuldu. Lütfen Kaydýnýzý Tamamlamak Ýçin " + user.getEmail()
				+ " Adresine Gelen Doðrulama Linkine Týklayýnýz..");
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullancýsý Doðrulama Mailini Onayladý..");
		users.add(user);
	}

	@Override
	public void delete(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullanýcýsý Sistemden Silinmiþtir..");
		users.remove(user);
	}

	@Override
	public List<User> getAll() {
		return users;
	}
}
