package com.ibrahim.simsek.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibrahim.simsek.entity.User;
import com.ibrahim.simsek.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
  
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/create")
public ResponseEntity<User> createUser(@RequestBody User user){
	User resultUser = userService.createUser(user);
		return ResponseEntity.ok(resultUser);
}
	@GetMapping("/getAll")
 public ResponseEntity<List<User>> getUser(){
	List<User> users = userService.getUser();
	return ResponseEntity.ok(users);
			}
	@GetMapping("/getById/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") Long id){
		User user = userService.getUser(id);
		return ResponseEntity.ok(user);
	}
	@PutMapping("/edit/{id}")
  public ResponseEntity<User> updateUser(@PathVariable("id") Long id,@RequestBody User user){
		User resultUser = userService.updateUser(id,user);
		return ResponseEntity.ok(resultUser);
		
	}
	@DeleteMapping("remove/{id}")
	  public ResponseEntity<Boolean> deleteUser(@PathVariable("id") Long id){
			Boolean status = userService.deleteUser(id);
			return ResponseEntity.ok(status);
	}
}

