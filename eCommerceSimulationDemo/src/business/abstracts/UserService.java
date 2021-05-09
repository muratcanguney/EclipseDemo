package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {

	void register(User user);

	void login(String email, String password);

	void gmailLogin(String email);

	List<User> getAll();

}
