package com.example.studentproject.Service;

import com.example.studentproject.Model.Student;
import com.example.studentproject.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getStudents(){
        return (List<Student>) studentRepository.findAll();
    }

    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}
