package com.codegym.repository;

import com.codegym.model.DiaryClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDiaryClassRepository extends CrudRepository<DiaryClass,Long> {
}
