package inheritanceOdev;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getUserName() + " Kullanicisi Sisteme Eklenmi�tir..");
	}

	public void delete(User user) {
		System.out.println(user.getUserName() + " Kullanicisi Sistemden Silinmi�tir..");
	}

	public void update(User user) {
		System.out.println(user.getUserName() + " Kullanicisi G�ncellenmi�tir..");
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}