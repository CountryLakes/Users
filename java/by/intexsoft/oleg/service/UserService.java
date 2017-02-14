package by.intexsoft.oleg.service;

import java.util.List;

import by.intexsoft.oleg.model.User;

/**
 * declare method findAllUsers
 */
public interface UserService {

	/**
	 * find all User
	 * 
	 * @return List User
	 */
	List<User> findAllUsers();
}
