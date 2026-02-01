package com.tico.mypawday.pet.infrastructure.repository.impl;

import com.tico.mypawday.pet.domain.repository.PetRepository;
import com.tico.mypawday.pet.infrastructure.repository.JpaPetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Pet Repository 구현체
 */
@Repository
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PetRepositoryImpl implements PetRepository {

    private final JpaPetRepository jpaPetRepository;
}