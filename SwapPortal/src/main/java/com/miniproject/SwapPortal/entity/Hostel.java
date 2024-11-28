package com.miniproject.SwapPortal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hostel")
public class Hostel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "floor", nullable = false)
    private String floor;

    @Column(name = "room_number", nullable = false)
    private String roomNumber;

    @OneToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;
}