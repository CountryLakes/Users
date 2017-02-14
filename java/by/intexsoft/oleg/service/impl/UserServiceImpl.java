package by.intexsoft.oleg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.intexsoft.oleg.model.User;
import by.intexsoft.oleg.repository.UserRepository;
import by.intexsoft.oleg.service.UserService;

/**
 * class implements interface UserService and class is a Service with name
 * ("userService")
 */

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	/**
	 * UserService implementation
	 * 
	 * @return all User List
	 */
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

}
