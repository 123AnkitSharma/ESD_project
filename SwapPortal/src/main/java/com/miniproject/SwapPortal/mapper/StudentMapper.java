package com.miniproject.SwapPortal.mapper;

import com.miniproject.SwapPortal.dto.StudentRequest;
import com.miniproject.SwapPortal.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {
    public Student toEntity(StudentRequest request) {
        return Student.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .password(request.password())
                .build();
    }
}
