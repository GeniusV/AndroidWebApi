package com.geniusver.repo;

import com.geniusver.entities.Teacher;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by GeniusV on 6/4/18.
 */
@RepositoryRestResource(collectionResourceRel = "teacher", path = "teacher")
public interface TeacherRepository extends PagingAndSortingRepository<Teacher, Long> {
    Teacher findByIdAndPassword(@Param("id") Long id, @Param("password") String password);
}
