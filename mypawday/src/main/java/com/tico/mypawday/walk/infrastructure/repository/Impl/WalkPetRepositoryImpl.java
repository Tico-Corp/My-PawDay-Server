package com.tico.mypawday.walk.infrastructure.repository.Impl;

import com.tico.mypawday.walk.domain.repository.WalkPetRepository;
import com.tico.mypawday.walk.infrastructure.repository.JpaWalkPetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * WalkPet Repository 구현체
 */
@Repository
@RequiredArgsConstructor
public class WalkPetRepositoryImpl implements WalkPetRepository {
    
    private final JpaWalkPetRepository jpaWalkPetRepository;
}