package com.example.studentproject.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class SubjectTaking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subjectTaking_generator")
    @SequenceGenerator(name = "subjectTaking_generator", sequenceName = "subjectTaking_seq")

    private Long id;
    private String name;
}
