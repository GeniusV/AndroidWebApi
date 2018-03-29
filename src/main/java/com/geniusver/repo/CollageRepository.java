package com.geniusver.repo;

import com.geniusver.entities.Collage;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Copyright (c) 2018 GeniusV
 * All rights reserved.
 * Created by GeniusV on 3/21/18.
 */

@RepositoryRestResource(collectionResourceRel = "collage", path = "collage")
public interface CollageRepository extends PagingAndSortingRepository<Collage, Long> {
    Collage findByName(@Param("name") String name);
}

