package com.geniusver.repo;

import com.geniusver.entities.Collage;
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
@RepositoryRestResource(collectionResourceRel = "major", path = "major")
public interface MajorRepository extends PagingAndSortingRepository<Major, Long> {
    Page<Major> findByCollage(@Param("collage") Collage collage, Pageable page);
    Major findByName(@Param("name") String name, Pageable page);
}
