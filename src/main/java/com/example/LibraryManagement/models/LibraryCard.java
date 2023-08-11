package com.example.LibraryManagement.models;

import com.example.LibraryManagement.Enums.Cardstatus;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
@AllArgsConstructor
@NoArgsConstructor
public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lid;
    private Integer limit;
    private Integer noofbooksissued;
    @Enumerated(value = EnumType.STRING)
    private Cardstatus cardstatus;
    @OneToOne
    @JoinColumn
    private Student student;


}
