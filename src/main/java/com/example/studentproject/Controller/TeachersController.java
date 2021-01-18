package com.example.studentproject.Controller;

import com.example.studentproject.Model.Teachers;
import com.example.studentproject.Service.TeachersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeachersController {
    public final TeachersService teachersService;

    public TeachersController(TeachersService teachersService){
        this.teachersService = teachersService;
    }

    @PostMapping(path = "/createTeachers")
    private Teachers create(@RequestBody Teachers teachers){
        return teachersService.create(teachers);
    }

    @GetMapping(path = "/Teachers")
    public List<Teachers> getAll(){
        return teachersService.getAll();
    }

    @PostMapping(path = "/updateTeachers")
    public Teachers update(@RequestBody Teachers teachers){
        return teachersService.update(teachers);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/teacher/{id}")
    public void delete(@PathVariable("id")Long id){
        teachersService.delete(id);
    }

}
