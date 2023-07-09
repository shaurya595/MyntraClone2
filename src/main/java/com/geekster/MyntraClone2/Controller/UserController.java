package com.geekster.MyntraClone2.Controller;

import com.geekster.MyntraClone2.Models.User;
import com.geekster.MyntraClone2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping()
    public void addUser(@RequestBody User user){
        userService.insertUser(user);
    }
    @GetMapping()
    public Iterable<User> getUser(){
        return userService.getAllUser();
    }
}
