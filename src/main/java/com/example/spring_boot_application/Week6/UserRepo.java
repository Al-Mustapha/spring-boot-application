package com.example.spring_boot_application.Week6;

import com.example.spring_boot_application.Week4.FirstEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<FirstEntity, Long> {
}
