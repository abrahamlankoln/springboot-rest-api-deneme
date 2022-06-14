package com.ibrahim.simsek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibrahim.simsek.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
