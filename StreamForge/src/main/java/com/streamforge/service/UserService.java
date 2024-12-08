package com.streamforge.service;

import com.streamforge.entity.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    List<User> getAllUsers();
}
