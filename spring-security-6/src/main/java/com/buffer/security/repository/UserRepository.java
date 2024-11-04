package com.buffer.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buffer.security.entity.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer> {

	Usuario findByUserName(String userName);
}