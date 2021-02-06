package com.jt.Feedback.dao;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.jt.Feedback.model.User;

public interface UserDao {
	int insertUser(int id, User user);
	default int insertUser(User user) {
		int id;
		 id = user.getId();

		user.setId(id);
		return insertUser(id, user);
		
	}
	List<User> selectAllUsers();
}
