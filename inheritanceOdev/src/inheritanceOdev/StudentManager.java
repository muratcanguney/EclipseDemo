package inheritanceOdev;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {

		System.out.println(user.getUserName() + " Kullan�c�s� E�itime Kat�lm��t�r..");

	}
}