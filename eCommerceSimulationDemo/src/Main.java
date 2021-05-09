import business.abstracts.UserService;
import business.concretes.UserManager;
import core.GmailAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new HibernateUserDao(), new GmailAdapter());

		User user1 = new User(1, "Murat", "Güney", "muratcanguney@hotmail.com", null);
		userService.register(user1);

		User user2 = new User(1, "Murat", "Güney", "muratcanguney@hotmail.com", "123");
		userService.register(user2);

		User user3 = new User(1, "Murat", "Güney", "muratcanguney.hotmail.com", "123456");
		userService.register(user3);

		User user4 = new User(1, "Murat", "G", "muratcanguney@hotmail.com", "123456");
		userService.register(user4);

		User user5 = new User(1, "Murat", "Güney", "muratcanguney@hotmail.com", "123456");
		userService.register(user5);

		System.out.println("--------------------------------------");

		userService.gmailLogin("muratcanguney@hotmail.com");
		userService.gmailLogin("muratcanguney@gmail.com");

		userService.login("muratcanguney@hotmail.com", null);
		userService.login("muratcanguney@hotmail.com", "12345");
	}
}
