package com.geniusver.repo;

import com.geniusver.entities.Collage;
import com.geniusver.entities.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Copyright (c) 2018 GeniusV
 * All rights reserved.
 * Created by GeniusV on 3/21/18.
 */

@RepositoryRestResource(collectionResourceRel = "course", path = "course")
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
    Page<Course> findByCollage(@Param("collage") Collage collage, Pageable page);

    Course findByName(@Param("name") String name);
}
