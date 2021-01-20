package com.example.studentproject.Service;

import com.example.studentproject.Model.Teacher;
import com.example.studentproject.Repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }

    public Teacher createTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getTeachers(){
        return (List<Teacher>) teacherRepository.findAll();
    }

    public Teacher updateTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Long id){
        teacherRepository.deleteById(id);
    }
}
