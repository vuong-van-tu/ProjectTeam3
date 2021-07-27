package com.codegym.model;


import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToMany(mappedBy = "class_sub")
    private Collection<Subject> subjects;


    @ManyToMany(targetEntity = User.class,fetch = FetchType.EAGER)
    @JoinTable(name = "user_class",
                joinColumns = @JoinColumn(name = "class_id"),
                inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Collection<User> students;

    public Class() {
    }

    public Class(long id, String name, Collection<Subject> subjects, Collection<User> students) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Collection<Subject> subjects) {
        this.subjects = subjects;
    }

    public Collection<User> getStudents() {
        return students;
    }

    public void setStudents(Collection<User> students) {
        this.students = students;
    }
}
