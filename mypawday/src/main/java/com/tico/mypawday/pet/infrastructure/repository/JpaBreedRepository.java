package com.tico.mypawday.pet.infrastructure.repository;

import com.tico.mypawday.pet.domain.entity.Breed;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA 기반 품종 리포지터리 인터페이스
 */
public interface JpaBreedRepository extends JpaRepository<Breed, Long> {
}