package com.example.studentproject.Controller;

import com.example.studentproject.Model.Course;
import com.example.studentproject.Service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @PostMapping(path = "/createCourse")
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }

    @GetMapping(path = "/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @PostMapping(path = "/updateCourse")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
    public void deleteCourse(@PathVariable("id")Long id){
        courseService.deleteCourse(id);
    }
}
