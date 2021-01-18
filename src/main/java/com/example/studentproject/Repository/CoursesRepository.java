package com.example.studentproject.Repository;

import com.example.studentproject.Model.Courses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends CrudRepository<Courses, Long> {
}
