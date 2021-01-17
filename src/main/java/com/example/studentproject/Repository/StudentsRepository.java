package com.example.studentproject.Repository;

import com.example.studentproject.Model.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepository extends CrudRepository<Students, Long> {
}
