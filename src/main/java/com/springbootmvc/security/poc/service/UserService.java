package com.springbootmvc.security.poc.service;

import com.springbootmvc.security.poc.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}