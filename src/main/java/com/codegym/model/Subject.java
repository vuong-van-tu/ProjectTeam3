package com.codegym.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToMany(targetEntity = Class.class,fetch = FetchType.EAGER)
    @JoinTable(name = "subject_class",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "class_id"))
    private Collection<Class> class_sub;

    public Subject(long id, String name, Collection<Class> classes) {
        this.id = id;
        this.name = name;
        this.class_sub = classes;
    }

    public Subject() {
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

    public Collection<Class> getClasses() {
        return class_sub;
    }

    public void setClasses(Collection<Class> classes) {
        this.class_sub = classes;
    }
}
