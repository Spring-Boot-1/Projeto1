/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.AULA1.Controllers;

import com.example.AULA1.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    
    private UserRepository userrepository;
    
    private UserController (UserRepository userrepository){
    this.userrepository = userrepository;
    
}
    @RequestMapping("/user")
    public String GetUsers (Model model){
        model.addAttribute("UsersList", this.userrepository.findAll());
        return "user";
    }
}
