package com.ibrahim.simsek.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.ibrahim.simsek.entity.User;
import com.ibrahim.simsek.repository.UserRepository;
import com.ibrahim.simsek.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
 
	private final UserRepository userRepository;

	@Override
	public User createUser(User user) {
	user.setCreatedAt(new Date());
	user.setCreatedBy("admin");
		return userRepository.save(user);
	}

	@Override
	public List<User> getUser() {
	
		return userRepository.findAll();
	}

	@Override
	public User getUser(Long id) {
		Optional<User> user = userRepository.findById(id);
		if(user.isPresent()) {
			return user.get();
		}
		
		return null;
	}

	@Override
	public User updateUser(Long id, User user) {
		Optional<User> resultUser = userRepository.findById(id);
		if(resultUser.isPresent()) {
			resultUser.get().setFirstName(user.getFirstName());
			resultUser.get().setLastName(user.getLastName());
			resultUser.get().setUptaedAt(new Date());
			resultUser.get().setUptaedBy("admin");
			return userRepository.save(resultUser.get());
		}
		return null;
	}

	@Override
	public Boolean deleteUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
