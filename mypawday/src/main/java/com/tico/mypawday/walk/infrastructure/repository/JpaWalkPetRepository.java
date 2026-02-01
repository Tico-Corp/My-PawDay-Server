package com.tico.mypawday.walk.infrastructure.repository;

import com.tico.mypawday.walk.domain.entity.WalkPet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * WalkPet JPA Repository
 */
@Repository
public interface JpaWalkPetRepository extends JpaRepository<WalkPet, UUID> {
}