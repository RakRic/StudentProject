package com.example.studentproject.Service;


import com.example.studentproject.Model.SubjectTaking;
import com.example.studentproject.Repository.SubjectTakingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectTakingService {
    private final SubjectTakingRepository subjectTakingRepository;

    public SubjectTakingService(SubjectTakingRepository subjectTakingRepository){
        this.subjectTakingRepository = subjectTakingRepository;
    }

    public SubjectTaking createSubjectTaking(SubjectTaking subjectTaking){
        return subjectTakingRepository.save(subjectTaking);
    }

    public List<SubjectTaking> getAllST(){
        return (List<SubjectTaking>) subjectTakingRepository.findAll();
    }

    public SubjectTaking updateSubjectTaking(SubjectTaking subjectTaking){
        return subjectTakingRepository.save(subjectTaking);
    }

    public void deleteSubjectTaking(Long id){
        subjectTakingRepository.deleteById(id);
    }
}
