package com.example.studentproject.Repository;

import com.example.studentproject.Model.SubjectTaking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectTakingRepository extends CrudRepository<SubjectTaking, Long> {
}
