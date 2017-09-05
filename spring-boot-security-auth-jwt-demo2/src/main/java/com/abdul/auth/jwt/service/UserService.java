package com.abdul.auth.jwt.service;

import com.abdul.auth.jwt.model.User;

public interface UserService {
	User save(User user);

	User findByEmail(String email);

}
