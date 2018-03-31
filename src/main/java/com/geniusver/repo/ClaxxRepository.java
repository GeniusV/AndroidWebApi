package com.geniusver.repo;

import com.geniusver.entities.Claxx;
import com.geniusver.entities.Major;
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
@RepositoryRestResource(collectionResourceRel = "claxx", path = "claxx")
public interface ClaxxRepository extends PagingAndSortingRepository<Claxx, Long> {
    Page<Claxx> findByMajor(@Param("major") Major major, Pageable page);

    Claxx findByName(@Param("name") String name);
}
