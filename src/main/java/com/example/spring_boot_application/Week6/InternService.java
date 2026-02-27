package com.example.spring_boot_application.Week6;

import com.example.spring_boot_application.Week3.UserModel;
import com.example.spring_boot_application.Week4.FirstEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InternService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CustomerMapper mapper;

    public String addUser(UserModel model){
        userRepo.save(mapper.mapToEntity(model));
        return "User added";
    }

    public UserModel viewUser(Long id){
        FirstEntity user  = userRepo.findById(id).get();
        return mapper.mapToUserModel(user);
    }

}
