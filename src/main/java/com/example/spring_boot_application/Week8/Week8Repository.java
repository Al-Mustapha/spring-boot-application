package com.example.spring_boot_application.Week8;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Week8Repository extends JpaRepository<Week8Entity, Long> {
}
