package com.example.pick_a_book_indi.services;

import com.example.pick_a_book_indi.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void login(String username, String password);
    User findByUsername(String username);
    User findByEmail(String email);
    User findById(long id);
    List<User> fetchAll();
    void deleteById(Integer id);
}
