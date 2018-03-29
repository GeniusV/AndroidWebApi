package com.geniusver.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2018 GeniusV
 * All rights reserved.
 * Created by GeniusV on 3/22/18.
 */
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "claxxId", referencedColumnName = "id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private Claxx claxx;

    @org.hibernate.annotations.ForeignKey(name = "none")
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Score> scores = new ArrayList<>();

    @Column(unique = true)
    private String name;

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    public Claxx getClaxx() {
        return claxx;
    }


    public void setClaxx(Claxx claxx) {
        this.claxx = claxx;
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
