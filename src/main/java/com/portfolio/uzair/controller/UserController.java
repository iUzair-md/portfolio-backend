package com.portfolio.uzair.controller;

import com.portfolio.uzair.entity.User;
import com.portfolio.uzair.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/sendinfo")
    public String getInfo(@ModelAttribute("user") User user){
        return "Info";
    }

    @PostMapping("/sendinfo")

    public ResponseEntity<String> saveInfo(@RequestBody User user) {
        userRepo.save(user);
        return ResponseEntity.ok("Submitted Successfully");
    }
}
