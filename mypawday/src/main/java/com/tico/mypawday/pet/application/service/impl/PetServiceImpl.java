package com.tico.mypawday.pet.application.service.impl;

import com.tico.mypawday.pet.application.service.PetService;
import com.tico.mypawday.pet.domain.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 반려동물 서비스 구현체
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;

}