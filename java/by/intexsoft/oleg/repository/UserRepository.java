package by.intexsoft.oleg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import by.intexsoft.oleg.model.User;

/**
 * UserRepository is repository and declare method findAll()
 */
public interface UserRepository extends JpaRepository<User, Integer> {

	/**
	 * find all from entity User
	 * 
	 * @return User List
	 */
	List<User> findAll();
}
