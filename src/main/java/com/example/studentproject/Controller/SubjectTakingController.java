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
    public SubjectTaking createSubjectTaking(@RequestBody SubjectTaking subjectTaking){
        return subjectTakingService.createSubjectTaking(subjectTaking);
    }

    @GetMapping(value = "/Subjects")
    public List<SubjectTaking> getAllST(){
        return subjectTakingService.getAllST();
    }

    @PostMapping(value = "/updateSubjectTaking")
    private SubjectTaking updateSubjectTaking(@RequestBody SubjectTaking subjectTaking){
        return subjectTakingService.updateSubjectTaking(subjectTaking);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/subjects/{id}")
    public void deleteSubjectTaking(@PathVariable("id") Long id){
        subjectTakingService.deleteSubjectTaking(id);
    }
}
