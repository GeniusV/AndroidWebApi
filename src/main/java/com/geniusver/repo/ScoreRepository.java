package com.geniusver.repo;

import com.geniusver.entities.Score;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Id;

/**
 * Copyright (c) 2018 GeniusV
 * All rights reserved.
 * Created by GeniusV on 3/22/18.
 */
@RepositoryRestResource(collectionResourceRel = "score", path = "score")
public interface ScoreRepository extends PagingAndSortingRepository<Score, Long> {
}
