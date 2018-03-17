package com.pvc.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pvc.entity.User;


/**
 * @author P.Venkatesh
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
 