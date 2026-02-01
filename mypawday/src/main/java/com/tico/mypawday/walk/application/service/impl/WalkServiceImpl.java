package com.tico.mypawday.walk.application.service.impl;

import com.tico.mypawday.walk.application.service.WalkService;
import com.tico.mypawday.walk.domain.repository.WalkMediaRepository;
import com.tico.mypawday.walk.domain.repository.WalkPetRepository;
import com.tico.mypawday.walk.domain.repository.WalkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 산책 일기 Service 구현체
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class WalkServiceImpl implements WalkService {
    
    private final WalkRepository walkRepository;
    private final WalkPetRepository walkPetRepository;
    private final WalkMediaRepository walkMediaRepository;
}