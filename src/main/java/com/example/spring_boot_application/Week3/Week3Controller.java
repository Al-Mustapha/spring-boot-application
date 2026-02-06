package com.example.spring_boot_application.Week3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/flexisaf-internship/")
public class Week3Controller {



    @PostMapping("register")
    public UserModel register(@RequestBody UserModel userModel){
            return userModel;
    }

    @PutMapping("update/{userId}")
    public String update(@PathVariable("userId") String userId, UserModel userModel){
        return "updated successfully";
    }

    @GetMapping("getUser/{userId}")
    public String getUser(@PathVariable("userId") String userId){
        return "user with " + userId + " exists.";
    }

    @DeleteMapping("delete/{userId}")
    public String deleteUser(@PathVariable("userId") String user){
        return "User deleted.";
    }

}
