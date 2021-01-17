package com.example.studentproject.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "courses_generator")
    @SequenceGenerator(name = "courses_generator", sequenceName = "courses_seq")

    private long id;
    private int code;
    private String name;
    private String teacherName;
    private int startingDate;
}
