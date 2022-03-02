package com.codegate.springsecurity.repository;

import org.springframework.data.repository.CrudRepository;

import com.codegate.springsecurity.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);
}
