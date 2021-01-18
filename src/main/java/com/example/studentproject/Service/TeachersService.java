package com.example.studentproject.Service;

import com.example.studentproject.Model.Teachers;
import com.example.studentproject.Repository.TeachersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachersService {
    private final TeachersRepository teachersRepository;

    public TeachersService(TeachersRepository teachersRepository){
        this.teachersRepository = teachersRepository;
    }

    public Teachers create(Teachers teachers){
        return teachersRepository.save(teachers);
    }

    public List<Teachers> getAll(){
        return (List<Teachers>) teachersRepository.findAll();
    }

    public Teachers update(Teachers teachers){
        return teachersRepository.save(teachers);
    }

    public void delete(Long id){
        teachersRepository.deleteById(id);
    }
}
