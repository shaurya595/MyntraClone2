package com.geekster.MyntraClone2.Service;

import com.geekster.MyntraClone2.Models.User;
import com.geekster.MyntraClone2.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public void insertUser(User user) {
        userRepo.save(user);
    }

    public Iterable<User> getAllUser() {
        Iterable<User>getAll = userRepo.findAll();
        return  getAll;
    }
}
