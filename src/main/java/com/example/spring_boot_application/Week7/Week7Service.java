package com.example.spring_boot_application.Week7;

import com.example.spring_boot_application.Week3.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Week7Service {

    @Autowired
    private Week7Repository week7Repository;
    public String addUser(UserModel userModel) {
        Week7Entity week7Entity = new Week7Entity();
        BeanUtils.copyProperties(userModel, week7Entity);
        return "User added";
    }


    public String updateProfile(Long user, UserModel userModel) {
        Week7Entity week7Entity = week7Repository.findById(user)
                .orElseThrow(()-> new UserNotFoundException("" +
                        "No user with Id = " + user + " exists"));
        BeanUtils.copyProperties(userModel, week7Entity);
        return "User updated.";
    }

    public void findUser(Long user) {
        week7Repository.findById(user).orElseThrow(()-> new UserNotFoundException("" +
                "No user with Id = " + user + " exists"));
    }

    public String deleteUserById(Long user) {
        week7Repository.deleteById(user);
        return "User with ID=" + user + " deleted.";
    }
}
