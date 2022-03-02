package com.codegate.springsecurity;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.codegate.springsecurity.model.Role;
import com.codegate.springsecurity.model.User;
import com.codegate.springsecurity.repository.RoleRepository;
import com.codegate.springsecurity.repository.UserRepository;

@Component
public class DataLoader implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {
		roleRepository.save(new Role("USER"));
		roleRepository.save(new Role("ADMIN"));

		Role adminRole = roleRepository.findByRole("ADMIN");
		Role userRole = roleRepository.findByRole("USER");

		User user = new User("admin@alvarofonteles", passwordEncoder.encode("123"), "Admin", "Super", true, "admin");
		user.setRoles(Arrays.asList(adminRole));
		userRepository.save(user);

		user = new User("user@alvarofonteles", passwordEncoder.encode("456"), "User", "Super", true, "user");
		user.setRoles(Arrays.asList(userRole));
		userRepository.save(user);

		user = new User("fonteles@alvarofonteles", passwordEncoder.encode("789"), "alvaro", "fonteles", true,
				"fonteles");
		user.setRoles(Arrays.asList(adminRole));
		userRepository.save(user);

	}

}
