package com.miniproject.SwapPortal.controller;

import com.miniproject.SwapPortal.dto.LoginRequest;
import com.miniproject.SwapPortal.dto.StudentDetailsResponse;
import com.miniproject.SwapPortal.dto.StudentRequest;
import com.miniproject.SwapPortal.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/student/auth")
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody @Valid StudentRequest request) {
        return ResponseEntity.ok(studentService.createStudent(request));
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginStudent(@RequestBody @Valid LoginRequest request) {
        return ResponseEntity.ok(studentService.loginStudent(request));
    }

    @GetMapping("/about-me")
    public ResponseEntity<StudentDetailsResponse> getStudentDetails(@RequestParam Long studentId) {
        return ResponseEntity.ok(studentService.getStudentDetails(studentId));
    }
}

