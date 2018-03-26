package com.geniusver.repo;

import com.geniusver.entities.Term;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Copyright (c) 2018 GeniusV
 * All rights reserved.
 * Created by GeniusV on 3/22/18.
 */
@RepositoryRestResource(collectionResourceRel = "term", path = "term")
public interface TermRepository extends PagingAndSortingRepository<Term, Long> {
}
