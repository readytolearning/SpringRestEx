package com.pvc.resource;
import org.jinstagram.Instagram;
import org.jinstagram.auth.InstagramAuthService;
import org.jinstagram.auth.model.Token;
import org.jinstagram.auth.model.Verifier;
import org.jinstagram.auth.oauth.InstagramService;
import org.jinstagram.entity.users.basicinfo.UserInfo;
import org.jinstagram.exceptions.InstagramException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pvc.entity.User;
import com.pvc.service.IUserService;

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
	
	@PostMapping("user")
	public @ResponseBody User addArticle(@RequestBody User user) {
        return userService.saveUser(user);
	}
	
	/*@GetMapping("data")
	public @ResponseBody UserInfo getData() {
       // return userService.saveUser(user);
	    

		InstagramService service = new InstagramAuthService()
				.apiKey("4350cb515fad42dc8e2923e6d9a9cb41")
				.apiSecret("ec874976fcea439994becb60528b8f77")
				.callback("http://localhost:8080")     
				.build();
		//Token token = service.getRequestToken();
		// Verifier verifier = new Verifier(CODE);

	        Token accessToken = service.getAccessToken(service);
	        Instagram instagram = new Instagram(accessToken);
		//Instagram instagram = new Instagram("54614847f50c452fa407e5840341c529");
		UserInfo userInfo = null;
		try {
			userInfo = instagram.getCurrentUserInfo();
		} catch (InstagramException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(userInfo.getData().getUsername());

		
		
		return userInfo;
	}
	
	*/
	

} 