package com.abelslawncare.website.Controllers;

import com.abelslawncare.website.Models.User;
import com.abelslawncare.website.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping()
    public Object getAllUsers(){
        return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Object getUserById(@PathVariable long id){
        return new ResponseEntity<>(service.getUserById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public Object updateUserById(@PathVariable long id, @RequestBody User user){
        service.updateUser(id, user);
        return new ResponseEntity<>(service.getUserById(id), HttpStatus.OK);
    }

    @PostMapping("/new")
    public Object createUser(@RequestBody User user){
        service.addNewUser(user);
        return new ResponseEntity<>(service.getAllUsers(), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public Object deleteUser(@PathVariable long id){
        service.deleteUser(id);
        return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
    }
}
