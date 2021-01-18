package com.example.studentproject.Controller;

import com.example.studentproject.Model.SubjectTaking;
import com.example.studentproject.Service.SubjectTakingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectTakingController {
    public final SubjectTakingService subjectTakingService;

    public SubjectTakingController(SubjectTakingService subjectTakingService){
        this.subjectTakingService = subjectTakingService;
    }

    @PostMapping(value = "/createSubject")
    public SubjectTaking create(@RequestBody SubjectTaking subjectTaking){
        return subjectTakingService.create(subjectTaking);
    }

    @GetMapping(value = "/Subjects")
    public List<SubjectTaking> getAll(){
        return subjectTakingService.getAll();
    }

    @PostMapping(value = "/updateSubjectTaking")
    private SubjectTaking update(@RequestBody SubjectTaking subjectTaking){
        return subjectTakingService.update(subjectTaking);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/subjects/{id}")
    public void delete(@PathVariable("id") Long id){
        subjectTakingService.delete(id);
    }
}
