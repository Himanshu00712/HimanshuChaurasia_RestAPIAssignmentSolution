package com.greatlearning.empManagement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.greatlearning.empManagement.model.Role;
import com.greatlearning.empManagement.model.User;
import com.greatlearning.empManagement.repository.UserRepository;

@SpringBootApplication
public class EmpManagementApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EmpManagementApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setId(1);
		user.setUsername("admin");
		user.setPassword(new BCryptPasswordEncoder().encode("admin"));
		List<Role> roles = new ArrayList<>();
		roles.add(new Role(1,"ADMIN"));
		user.setListOfRoles(roles);
		userRepository.save(user);
	}

}
