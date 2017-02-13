package com.idega.block.user.bean;

import java.io.Serializable;

import com.idega.util.Encrypter;

public class UserCredentials implements Serializable {

	private static final long serialVersionUID = 2640925255189077774L;

	private String username;

	private String password;

	private boolean enabled = false;

	public UserCredentials() {
		super();
	}

	public UserCredentials(String username, String password, boolean enabled) {
		this();

		this.username = username;
		this.password = Encrypter.encryptOneWay(password);
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

}