package com.example.spring_boot_application.Week6;

import com.example.spring_boot_application.Week3.UserModel;
import com.example.spring_boot_application.Week4.FirstEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    public FirstEntity mapToEntity(UserModel model){
        FirstEntity firstEntity = new FirstEntity();
        BeanUtils.copyProperties(model, firstEntity);
        return firstEntity;
    }

    public UserModel mapToUserModel(FirstEntity user) {
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(user, userModel);
        return userModel;
    }
}
