package com.example.studentproject.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "students_generator")
    @SequenceGenerator(name = "students_generator", sequenceName = "students_seq")

    private long id;
    private String name;
    private long studentIdentifier;
    private String password;
}
