package inheritanceOdev;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {

		System.out.println(user.getUserName() + " Kullanıcısı Eğitime Katılmıştır..");

	}
}