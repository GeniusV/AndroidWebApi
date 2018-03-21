package com.geniusver.repo;

import com.geniusver.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Copyright (c) 2018 GeniusV
 * All rights reserved.
 * Created by GeniusV on 3/21/18.
 */


@RepositoryRestResource(collectionResourceRel = "course", path = "course")
public interface CourseRepository extends CrudRepository<Course, Long> {
}
