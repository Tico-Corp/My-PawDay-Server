package com.tico.mypawday.pet.infrastructure.repository;

import com.tico.mypawday.pet.domain.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * JPA 기반 반려동물 리포지터리 인터페이스
 */
public interface JpaPetRepository extends JpaRepository<Pet, UUID> {
}