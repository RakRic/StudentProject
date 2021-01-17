package com.example.studentproject.Service;

import com.example.studentproject.Model.Courses;
import com.example.studentproject.Repository.CoursesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {
    private final CoursesRepository coursesRepository;

    public CoursesService(CoursesRepository coursesRepository){
        this.coursesRepository = coursesRepository;
    }

    public Courses create(Courses courses){
        return coursesRepository.save(courses);
    }

    public List<Courses> getAll(){
        return (List<Courses>) coursesRepository.findAll();
    }

    public Courses update(Courses courses){
        return coursesRepository.save(courses);
    }

    public void delete(Long id){
        coursesRepository.deleteById(id);
    }
}
