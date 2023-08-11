package com.example.LibraryManagement.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int auid;
    private String name;
    private int bcom;
    private int pendbooks;
    @Column(unique = true)
    private String email;
    private String penname;
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    List<Book> list = new ArrayList<>();

}
