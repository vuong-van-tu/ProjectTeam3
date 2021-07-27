package com.codegym.repository;

import com.codegym.model.Role;
import com.codegym.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


@Repository
public interface IUserRepository extends CrudRepository<User,Long> {
    @Query("SELECT r FROM Role r inner join r.users u where u in (:users)")
    List<Role> findUserByRoles(@Param("users") Iterable<User> userCollection);
}
