package com.example.studentproject.Controller;

import com.example.studentproject.Model.Teacher;
import com.example.studentproject.Service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
    public final TeacherService teacherService;

    public TeacherController(TeacherService teacherService){
        this.teacherService = teacherService;
    }

    @PostMapping(path = "/createTeacher")
    private Teacher createTeacher(@RequestBody Teacher teacher){
        return teacherService.createTeacher(teacher);
    }

    @GetMapping(path = "/Teachers")
    public List<Teacher> getTeachers(){
        return teacherService.getTeachers();
    }

    @PostMapping(path = "/updateTeacher")
    public Teacher updateTeacher(@RequestBody Teacher teacher){
        return teacherService.updateTeacher(teacher);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/teacher/{id}")
    public void deleteTeacher(@PathVariable("id")Long id){
        teacherService.deleteTeacher(id);
    }

}
