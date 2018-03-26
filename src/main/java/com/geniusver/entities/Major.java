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
public class Major {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "collageId", referencedColumnName = "id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private Collage collage;

    @org.hibernate.annotations.ForeignKey(name = "none")
    @OneToMany(mappedBy = "major", cascade = CascadeType.ALL)
    private List<Claxx> claxxes = new ArrayList<>();

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

    public Collage getCollage() {
        return collage;
    }

    public void setCollage(Collage collage) {
        this.collage = collage;
    }

    public List<Claxx> getClaxxes() {
        return claxxes;
    }

    public void setClaxxes(List<Claxx> claxxes) {
        this.claxxes = claxxes;
    }
}
