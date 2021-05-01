package inheritanceOdev;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getUserName() + " Kullanýcýsý Sisteme Eklenmiþtir..");
	}

	public void delete(User user) {
		System.out.println(user.getUserName() + " Kullanýcýsý Sistemden Silinmiþtir..");
	}

	public void update(User user) {
		System.out.println(user.getUserName() + " Kullanýcýsý Güncellenmiþtir..");
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}
