package com.example.LibraryManagement.models;

import com.example.LibraryManagement.Enums.Department;
import com.example.LibraryManagement.Enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollno;
    private String name;
    @Enumerated(value = EnumType.STRING)
    private Department department;
    @Column(unique = true)
    private String email;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private LibraryCard libraryCard;



}
