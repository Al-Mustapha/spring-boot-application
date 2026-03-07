package com.example.spring_boot_application.Week8;

import com.example.spring_boot_application.Week3.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/week7/flexisaf-internship/")
public class Week8Controller {

    @Autowired
    private Week8Service week8Service;


    @PostMapping("users/register")
    public String register(@RequestBody UserModel userModel){
        return week8Service.addUser(userModel);
    }

    @PutMapping("users/update/{user}")
    public String update(@PathVariable("user") Long user, UserModel userModel){
        return week8Service.updateProfile(user, userModel);
    }

    @GetMapping("users/getUser/{user}")
    public void getUser(@PathVariable("user") Long user){
        week8Service.findUser(user);
    }

    @DeleteMapping("users/delete/{userId}")
    public String deleteUser(@PathVariable("userId") Long user){
        return week8Service.deleteUserById(user);
    }
}
