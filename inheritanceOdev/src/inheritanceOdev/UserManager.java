package inheritanceOdev;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getUserName() + " Kullan�c�s� Sisteme Eklenmi�tir..");
	}

	public void delete(User user) {
		System.out.println(user.getUserName() + " Kullan�c�s� Sistemden Silinmi�tir..");
	}

	public void update(User user) {
		System.out.println(user.getUserName() + " Kullan�c�s� G�ncellenmi�tir..");
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}
