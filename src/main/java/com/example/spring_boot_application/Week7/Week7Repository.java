package com.example.spring_boot_application.Week7;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Week7Repository extends JpaRepository<Week7Entity, Long> {
}
