package com.tico.mypawday.pet.application.service.impl;

import com.tico.mypawday.pet.application.service.BreedService;
import com.tico.mypawday.pet.domain.repository.BreedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 품종 서비스 구현체
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BreedServiceImpl implements BreedService {

    private final BreedRepository breedRepository;
}