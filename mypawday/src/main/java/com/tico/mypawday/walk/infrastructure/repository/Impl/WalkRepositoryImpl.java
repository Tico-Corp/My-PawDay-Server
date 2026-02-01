package com.tico.mypawday.walk.infrastructure.repository.Impl;

import com.tico.mypawday.walk.domain.repository.WalkRepository;
import com.tico.mypawday.walk.infrastructure.repository.JpaWalkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * Walk Repository 구현체
 */
@Repository
@RequiredArgsConstructor
public class WalkRepositoryImpl implements WalkRepository {
    
    private final JpaWalkRepository jpaWalkRepository;
}