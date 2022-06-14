package com.ibrahim.simsek.service;

import java.util.List;

import com.ibrahim.simsek.entity.User;

public interface UserService {
 User createUser(User user);
 List<User> getUser();
 User getUser(Long id);
 User updateUser(Long id,User user);
 Boolean deleteUser(Long id);
}
