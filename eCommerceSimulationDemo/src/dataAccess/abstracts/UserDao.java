package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {

	void add(User user);

	void delete(User user);

	List<User> getAll();

}
