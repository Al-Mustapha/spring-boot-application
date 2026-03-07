package com.example.spring_boot_application.Week8;

import com.example.spring_boot_application.Week3.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Week8Service {

    @Autowired
    private Week8Repository week8Repository;
    public String addUser(UserModel userModel) {
        Week8Entity week8Entity = new Week8Entity();
        BeanUtils.copyProperties(userModel, week8Entity);
        return "User added";
    }


    public String updateProfile(Long user, UserModel userModel) {
        Week8Entity week8Entity = week8Repository.findById(user)
                .orElseThrow(()-> new UserNotFoundException("" +
                        "No user with Id = " + user + " exists"));
        BeanUtils.copyProperties(userModel, week8Entity);
        return "User updated.";
    }

    public void findUser(Long user) {
        week8Repository.findById(user).orElseThrow(()-> new UserNotFoundException("" +
                "No user with Id = " + user + " exists"));
    }

    public String deleteUserById(Long user) {
        week8Repository.deleteById(user);
        return "User with ID=" + user + " deleted.";
    }
}
