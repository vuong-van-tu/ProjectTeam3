package com.codegym.repository;

import com.codegym.model.Mark;
import org.springframework.data.repository.CrudRepository;

public interface IMarkRepository extends CrudRepository<Mark,Long> {
}
