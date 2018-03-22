package com.geniusver.repo;

import com.geniusver.entities.Claxx;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Copyright (c) 2018 GeniusV
 * All rights reserved.
 * Created by GeniusV on 3/22/18.
 */
@RepositoryRestResource(collectionResourceRel = "claxx", path = "claxx")
public interface ClaxxRepository extends PagingAndSortingRepository<Claxx, Long> {

}
