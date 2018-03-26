package com.geniusver.repo;

import com.geniusver.entities.Claxx;
import com.geniusver.entities.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Copyright (c) 2018 GeniusV
 * All rights reserved.
 * Created by GeniusV on 3/22/18.
 */

@RepositoryRestResource(collectionResourceRel = "student", path = "student")
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
    Page<Student> findByClaxx(@Param("claxx") Claxx claxx, Pageable page);
    Page<Student> findByName(@Param("name") String name, Pageable page);
    Page<Student> findByClaxxAndName(@Param("claxx") Claxx claxx, @Param("name") String name, Pageable page);
}
