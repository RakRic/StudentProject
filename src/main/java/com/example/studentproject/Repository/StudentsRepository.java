package com.example.studentproject.Repository;

import com.example.studentproject.Model.Students;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends CrudRepository<Students, Long> {
}
