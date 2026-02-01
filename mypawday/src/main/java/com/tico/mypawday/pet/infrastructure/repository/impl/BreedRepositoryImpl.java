package com.tico.mypawday.pet.infrastructure.repository.impl;

import com.tico.mypawday.pet.domain.repository.BreedRepository;
import com.tico.mypawday.pet.infrastructure.repository.JpaBreedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Breed Repository 구현체
 */
@Repository
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BreedRepositoryImpl implements BreedRepository {

    private final JpaBreedRepository jpaBreedRepository;
}