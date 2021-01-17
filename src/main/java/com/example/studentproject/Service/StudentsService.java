package com.example.studentproject.Service;

import com.example.studentproject.Model.Courses;
import com.example.studentproject.Model.Students;
import com.example.studentproject.Repository.StudentsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    public final StudentsRepository studentsRepository;

    public StudentsService(StudentsRepository studentsRepository){
        this.studentsRepository= studentsRepository;
    }
    public Students create(Students students){
        return studentsRepository.save(students);
    }

    public List<Students> getAll(){
        return (List<Students>) studentsRepository.findAll();
    }

    public Students update(Students students){
        return studentsRepository.save(students);
    }

    public void delete(Long id){
        studentsRepository.deleteById(id);
    }
}
