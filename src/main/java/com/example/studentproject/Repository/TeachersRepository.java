package com.example.studentproject.Repository;

import com.example.studentproject.Model.Teachers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepository extends CrudRepository<Teachers, Long> {
}
