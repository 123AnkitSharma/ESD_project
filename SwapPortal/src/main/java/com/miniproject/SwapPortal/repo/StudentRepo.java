package com.miniproject.SwapPortal.repo;

import com.miniproject.SwapPortal.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);
}
