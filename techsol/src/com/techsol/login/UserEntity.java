package com.techsol.login;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

@Named
@Entity
@EntityListeners(UserEntityListener.class)
@Table(name = "users", catalog = "techsol")
public class UserEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

	// Constructors

	/** default constructor */
	public UserEntity() {
	}

	/** full constructor */
	public UserEntity(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Property accessors
	@Id
	@Column(name = "username", unique = true, nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}