package com.idega.block.user.bean;

import java.io.Serializable;

public class UserCredentials implements Serializable {

	private static final long serialVersionUID = 2640925255189077774L;

	private String username;

	private String password;

	private boolean enabled = false;

	private Integer userId;

	public UserCredentials() {
		super();
	}

	public UserCredentials(Integer userId, String username, String password, boolean enabled) {
		this();

		this.userId = userId;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public final Integer getUserId() {
		return userId;
	}

	public final void setUserId(Integer userId) {
		this.userId = userId;
	}

}