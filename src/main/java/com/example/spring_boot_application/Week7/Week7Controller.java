package com.example.spring_boot_application.Week7;

import com.example.spring_boot_application.Week3.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/week7/flexisaf-internship/")
public class Week7Controller {

    @Autowired
    private Week7Service week7Service;


    @PostMapping("register")
    public String register(@RequestBody UserModel userModel){
        return week7Service.addUser(userModel);
    }

    @PutMapping("update/{user}")
    public String update(@PathVariable("user") Long user, UserModel userModel){
        return week7Service.updateProfile(user, userModel);
    }

    @GetMapping("getUser/{user}")
    public void getUser(@PathVariable("user") Long user){
        week7Service.findUser(user);
    }

    @DeleteMapping("delete/{userId}")
    public String deleteUser(@PathVariable("userId") Long user){
        return week7Service.deleteUserById(user);
    }
}
