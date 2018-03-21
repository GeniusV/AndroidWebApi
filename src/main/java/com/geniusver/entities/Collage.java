package com.geniusver.entities;

import javax.persistence.*;

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

    private String name;

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
