package com.example.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
