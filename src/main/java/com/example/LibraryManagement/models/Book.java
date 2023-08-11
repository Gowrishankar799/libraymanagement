package com.example.LibraryManagement.models;

import com.example.LibraryManagement.Enums.Catagory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table
@Setter
@Getter@AllArgsConstructor@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookid;
    private String bookname;
    private Integer price;
    private Date publicationdate;
    private Catagory catagory;
    // FORIEGN KEY PRESENT IN CHILD CLASS.
    // HERE IS THE RELATION MANY TO ONE BECAUSE ONE AUTHOR WROTE MORE ONE BOOKS.
    @ManyToOne
    @JoinColumn
    private Author author;

}
