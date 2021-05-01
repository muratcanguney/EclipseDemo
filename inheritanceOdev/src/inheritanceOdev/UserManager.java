package inheritanceOdev;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getUserName() + " Kullanıcısı Sisteme Eklenmiştir..");
	}

	public void delete(User user) {
		System.out.println(user.getUserName() + " Kullanıcısı Sistemden Silinmiştir..");
	}

	public void update(User user) {
		System.out.println(user.getUserName() + " Kullanıcısı Güncellenmiştir..");
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}
