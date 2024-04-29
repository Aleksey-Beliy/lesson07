package edu.training.web.bean;

import java.io.Serializable;
import java.util.Objects;

public class UserRegInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String login;
	private String email;
	private String password;
	private String passwordVerifier;

	public UserRegInfo() {

	}

	public UserRegInfo(String login, String email, String password, String passwordVerifier) {
		super();
		this.login = login;
		this.email = email;
		this.password = password;
		this.passwordVerifier = passwordVerifier;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordVerifier() {
		return passwordVerifier;
	}

	public void setPasswordVerifier(String passwordVerifier) {
		this.passwordVerifier = passwordVerifier;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, login, password, passwordVerifier);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRegInfo other = (UserRegInfo) obj;
		return Objects.equals(email, other.email) && Objects.equals(login, other.login)
				&& Objects.equals(password, other.password) && Objects.equals(passwordVerifier, other.passwordVerifier);
	}

}
