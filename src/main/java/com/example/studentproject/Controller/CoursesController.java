package com.example.studentproject.Controller;

import com.example.studentproject.Model.Courses;
import com.example.studentproject.Service.CoursesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursesController {
    private final CoursesService coursesService;

    public CoursesController(CoursesService coursesService){
        this.coursesService = coursesService;
    }

    @PostMapping(path = "/createCourses")
    public Courses create(@RequestBody Courses courses){
        return coursesService.create(courses);
    }

    @GetMapping(path = "/courses")
    public List<Courses> getAll(){
        return coursesService.getAll();
    }

    @PostMapping(path = "/updateCourses")
    public Courses update(@RequestBody Courses courses){
        return coursesService.update(courses);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
    public void delete(@PathVariable("id")Long id){
        coursesService.delete(id);
    }
}
