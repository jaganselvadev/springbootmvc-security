package com.springbootmvc.security.poc.repository;

import com.springbootmvc.security.poc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
