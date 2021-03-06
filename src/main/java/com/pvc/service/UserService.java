package com.pvc.service;

import com.pvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvc.repository.UserRepository;

/**
 * @author P.Venkatesh
 *
 */
@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepository userDAO;

	@Override
	public User getUserById(Long userId) {
		User obj = userDAO.findById(userId).get();
		return obj;
	}

	@Override
	public User saveUser(User user) {
		return userDAO.save(user);
	}
}
