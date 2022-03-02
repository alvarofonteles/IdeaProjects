package com.codegate.springsecurity.repository;

import org.springframework.data.repository.CrudRepository;

import com.codegate.springsecurity.model.Role;
import com.codegate.springsecurity.model.User;

public interface RoleRepository extends CrudRepository<Role, Long> {

	User findByRole(String role);
}
