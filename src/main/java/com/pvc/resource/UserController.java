package com.pvc.resource;

import com.pvc.entity.User;
import com.pvc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("rest")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	private static final String CODE = "code";
	
	@GetMapping("user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
		User user = userService.getUserById(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@GetMapping("users")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<List<User>> getUsers() {
		List<User> users = new ArrayList<>();
		User user = new User();
		user.setName("Venkat");
		users.add(user);
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	@PostMapping("saveUser")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
				// Call service and save Object
     		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

} 