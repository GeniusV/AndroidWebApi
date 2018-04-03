package com.geniusver.repo;

import com.geniusver.entities.Course;
import com.geniusver.entities.Score;
import com.geniusver.entities.Student;
import com.geniusver.entities.Term;
import com.geniusver.protection.ScoreProjection;
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
@RepositoryRestResource(collectionResourceRel = "score", path = "score", excerptProjection = ScoreProjection.class)
public interface ScoreRepository extends PagingAndSortingRepository<Score, Long> {

    Page<Score> findByStudent(@Param("student") Student student, Pageable page);

    Page<Score> findByCourse(@Param("course") Course course, Pageable page);

    Page<Score> findByStudentAndCourse(@Param("student") Student student, @Param("course") Course course, Pageable page);

    Page<Score> findByTerm(@Param("term") Term term, Pageable page);

    Page<Score> findByStudentAndTerm(@Param("student") Student student, @Param("term") Term term, Pageable page);

    Page<Score> findByCourseAndTerm(@Param("course") Course course, @Param("term") Term term, Pageable page);

    Page<Score> findByStudentAndCourseAndTerm(@Param("student") Student student, @Param("course") Course course, @Param("term") Term term, Pageable page);

}
