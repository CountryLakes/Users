package by.intexsoft.oleg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import by.intexsoft.oleg.model.User;
import by.intexsoft.oleg.service.UserService;

/**
 * class where method returns a domain object
 */
@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * requests to /test are mapped to the getUser() method
	 * 
	 * @return String users
	 */
	@RequestMapping("/test")
	public String getUser() {
		List<User> users = userService.findAllUsers();
		StringBuilder sb = new StringBuilder();
		for (User str : users) {
			sb.append(str.getId() + " ");
			sb.append(str.name + " ");
		}
		return sb.toString();
	}
}
