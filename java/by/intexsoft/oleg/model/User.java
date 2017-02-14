package by.intexsoft.oleg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * class user is entity and fit table="users"
 */
@Entity
@Table(name = "users")
public class User extends AbstractPersistable<Integer> {

	/**
	 * name fit column "name" in table
	 */
	@Column
	public String name;
}
