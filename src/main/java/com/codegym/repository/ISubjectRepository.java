package com.codegym.repository;

import com.codegym.model.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ISubjectRepository extends CrudRepository<Subject,Long> {
}
