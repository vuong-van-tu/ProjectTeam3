package com.codegym.repository;

import com.codegym.model.DiaryStudent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDiaryStudentRepository extends CrudRepository<DiaryStudent,Long> {
}
