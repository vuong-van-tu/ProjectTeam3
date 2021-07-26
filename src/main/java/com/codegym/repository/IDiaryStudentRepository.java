package com.codegym.repository;

import com.codegym.model.DiaryUser;
import org.springframework.data.repository.CrudRepository;

public interface IDiaryStudentRepository extends CrudRepository<DiaryUser,Long> {
}
