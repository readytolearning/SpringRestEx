package com.pvc.service;

import com.pvc.entity.User;

/**
 * @author P.Venkatesh
 *
 */
public interface IUserService {
	User getUserById(Long articleId);

	User saveUser(User user);
}
