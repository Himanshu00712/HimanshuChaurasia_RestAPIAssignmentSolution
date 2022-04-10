package com.greatlearning.empManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.empManagement.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	public Role findRoleByName(String name);
	
}
