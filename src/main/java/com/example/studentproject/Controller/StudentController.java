package com.example.studentproject.Controller;

import com.example.studentproject.Model.Student;
import com.example.studentproject.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    public final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping(path = "/createStudent")
    private Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping(path = "/Students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping(path = "/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
    public void deleteStudent(@PathVariable("id")Long id){
        studentService.delete(id);
    }
}
