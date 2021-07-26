package com.codegym.repository;

import com.codegym.model.Subject;
import org.springframework.data.repository.CrudRepository;

public interface ISubjectRepository extends CrudRepository<Subject,Long> {
}
