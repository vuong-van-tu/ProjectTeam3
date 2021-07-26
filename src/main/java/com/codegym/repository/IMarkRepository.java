package com.codegym.repository;

import com.codegym.model.Mark;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IMarkRepository extends CrudRepository<Mark,Long> {
}
