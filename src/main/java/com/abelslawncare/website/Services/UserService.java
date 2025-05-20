package com.abelslawncare.website.Services;


import com.abelslawncare.website.Models.User;
import com.abelslawncare.website.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(long id){
        return userRepository.findById(id).orElse(null);
    }

    public void addNewUser(User user){
        userRepository.save(user);
    }

    public void updateUser(long id, User user){
        User existing = getUserById(id);
        existing.setName(user.getName());
        existing.setEmail(user.getEmail());
        existing.setUsername(user.getUsername());
        existing.setPassword(user.getPassword());
        existing.setStatus(user.getStatus());
        existing.setWorkOrders(user.getWorkOrders());

        userRepository.save(existing);
    }

    public void deleteUser(long id){
        userRepository.deleteById(id);
    }
}
