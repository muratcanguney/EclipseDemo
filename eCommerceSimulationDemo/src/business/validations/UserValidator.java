package business.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserValidator {

	private UserDao userDao;

	public UserValidator(UserDao userDao) {
		this.userDao = userDao;
	}

	public static boolean userValid(User user) {
		if (nullControl(user) && passwordValidation(user.getPassword()) && emailValidation(user.getEmail())
				&& isUserThere(user) && firstNameValidation(user.getFirstName())
				&& lastNameValidation(user.getLastName()) && isUserVerified()) {
			return true;
		}
		return false;
	}

	private static boolean nullControl(User user) {
		if (user.getFirstName() == null) {
			System.out.println("Kullan�c� Ad� Bo� Ge�ilemez..");
			return false;
		} else if (user.getLastName() == null) {
			System.out.println("Kullan�c� Soyad� Bo� Ge�ilemez..");
			return false;
		} else if (user.getPassword() == null) {
			System.out.println("Kullan�c� �ifresi Bo� Ge�ilemez..");
			return false;
		} else if (user.getEmail() == null) {
			System.out.println("Kullan�c� Mail Adresi Bo� Ge�ilemez..");
			return false;
		}
		return true;
	}

	private static boolean passwordValidation(String password) {

		if (password.length() < 6) {
			System.out.println("Parola en az 6 karakter olmal�d�r..");
			return false;
		}
		return true;

	}

	private static boolean emailValidation(String email) {

		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&�*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
		Matcher matcher = pattern.matcher(email);
		if (!matcher.matches()) {
			System.out.println("E-Mail adresiniz Yanl��t�r..");
			return false;
		}
		return true;
	}

	private static boolean isUserThere(User user) {
		/*
		 * for (User users : userDao.getAll()) { if
		 * (users.getEmail().equals(user.getEmail())) { System.out.
		 * println("Kay�t olmaya �al��t���n�z mail adresi sistemde mevcuttur. L�tfen Giri� Yap�n�z.."
		 * ); return false; } }
		 */
		return true;
	}

	private static boolean firstNameValidation(String firstName) {
		if (firstName.length() < 2) {
			System.out.println("Kullan�c� Ad� En Az 2 Karakter Olmal�d�r..");
			return false;
		}
		return true;
	}

	private static boolean lastNameValidation(String lastName) {
		if (lastName.length() < 2) {
			System.out.println("Kullan�c� Soyad� En Az 2 Karakter Olmal�d�r..");
			return false;
		}
		return true;
	}

	private static boolean isUserVerified() {
		return true;
	}
}
