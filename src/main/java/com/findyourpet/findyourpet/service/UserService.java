package com.findyourpet.findyourpet.service;

import com.findyourpet.findyourpet.model.User;
import com.findyourpet.findyourpet.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User register(User user) {
        return repository.save(user);
    }

    public Optional<User> login(String email, String password) {
        return repository.findByEmail(email)
                .filter(u -> u.getPassword().equals(password)); // Hash in production!
    }
}
