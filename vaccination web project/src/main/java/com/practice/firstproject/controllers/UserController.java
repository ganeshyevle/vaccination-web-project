package com.practice.firstproject.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.practice.firstproject.model.User;
import com.practice.firstproject.repositroy.UserRepository;

   @Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/addUser")
    public String showAddUserForm(Model model) {
        model.addAttribute("user", new User());
        return "addUser";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute User user) {
        userRepository.save(user);
        return "redirect:/showAllUsers";
    }

    @GetMapping("/showAllUsers")
    public String showAllUsers(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "showAllUsers";
    }
}

