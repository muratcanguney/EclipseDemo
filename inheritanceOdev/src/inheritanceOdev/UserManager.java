package inheritanceOdev;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getUserName() + " Kullanicisi Sisteme Eklenmiþtir..");
	}

	public void delete(User user) {
		System.out.println(user.getUserName() + " Kullanicisi Sistemden Silinmiþtir..");
	}

	public void update(User user) {
		System.out.println(user.getUserName() + " Kullanicisi Güncellenmiþtir..");
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}