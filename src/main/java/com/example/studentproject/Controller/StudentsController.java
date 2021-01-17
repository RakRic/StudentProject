package com.example.studentproject.Controller;

import com.example.studentproject.Model.Students;
import com.example.studentproject.Service.StudentsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {
    public final StudentsService studentsService;

    public StudentsController(StudentsService studentsService){
        this.studentsService = studentsService;
    }

    @PostMapping(path = "/createStudents")
    private Students create(@RequestBody Students students){
        return studentsService.create(students);
    }

    @GetMapping(path = "/Students")
    public List<Students> getAll(){
        return studentsService.getAll();
    }

    @PostMapping(path = "/updateStudents")
    public Students update(@RequestBody Students students){
        return studentsService.update(students);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
    public void delete(@PathVariable("id")Long id){
        studentsService.delete(id);
    }
}
