package com.greatlearning.empManagement.service;

import java.util.List;

import com.greatlearning.empManagement.model.Role;
import com.greatlearning.empManagement.model.User;

public interface CredentialsService {

	Role addNewRole(String name);

	User addNewUser(String username, String password, String role_name);
	
	List<Role> listAllRoles();
}