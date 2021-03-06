package com.geniusver.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2018 GeniusV
 * All rights reserved.
 * Created by GeniusV on 3/21/18.
 */
@Entity
public class Collage {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(unique = true)
    private String name;

    @org.hibernate.annotations.ForeignKey(name = "none")
    @OneToMany(mappedBy = "collage", cascade = CascadeType.ALL)
    private List<Course> courses = new ArrayList<>();

    @org.hibernate.annotations.ForeignKey(name = "none")
    @OneToMany(mappedBy = "collage", cascade = CascadeType.ALL)
    private List<Major> majors = new ArrayList<>();


    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Major> getMajors() {
        return majors;
    }

    public void setMajors(List<Major> majors) {
        this.majors = majors;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
