package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	public List<User> users = new ArrayList<>();

	@Override
	public void add(User user) {

		System.out.println("Kullan�c� Kayd�n�z Olu�turuldu. L�tfen Kayd�n�z� Tamamlamak ��in " + user.getEmail()
				+ " Adresine Gelen Do�rulama Linkine T�klay�n�z..");
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullanc�s� Do�rulama Mailini Onaylad�..");
		users.add(user);
	}

	@Override
	public void delete(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullan�c�s� Sistemden Silinmi�tir..");
		users.remove(user);
	}

	@Override
	public List<User> getAll() {
		return users;
	}
}
