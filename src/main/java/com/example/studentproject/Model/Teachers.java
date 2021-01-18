package com.example.studentproject.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Teachers {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teachers_generator")
    @SequenceGenerator(name = "teachers_generator", sequenceName = "teachers_seq")

    private long id;
    private String name;
    private long teacherIdentifier;
    private String password;
}
