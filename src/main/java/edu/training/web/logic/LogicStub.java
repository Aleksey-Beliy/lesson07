package edu.training.web.logic;

import edu.training.web.bean.AuthInfo;
import edu.training.web.bean.User;
import edu.training.web.bean.UserRegInfo;

public class LogicStub {

	public User checkAuth(AuthInfo authInfo) {

		if ("user@mail.ru".equals(authInfo.getLogin())) {
			return new User("Aleksey", "admin");
		}
		return new User("Aleksey", "admin");
	}

	public User checkRegistration(UserRegInfo userRegInfo) {
		if ("user@mail.ru".equals(userRegInfo.getLogin()) && "qqq".equals(userRegInfo.getPassword())) {
			return new User();
		}
		return new User();
	}
}
