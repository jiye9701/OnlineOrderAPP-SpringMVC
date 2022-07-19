package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsersRepository extends JpaRepository<Users, String>{
	@Query(value = "SELECT * FROM users where userId = ?1 AND password = ?2", nativeQuery = true)
    List<Users> findUser(String userId, String pasword);
	
	@Query(value = "SELECT * FROM users where userId = 'admin' and password = 'admin'", nativeQuery = true)
    List<Users> findAdmin(String userId, String pasword);
}