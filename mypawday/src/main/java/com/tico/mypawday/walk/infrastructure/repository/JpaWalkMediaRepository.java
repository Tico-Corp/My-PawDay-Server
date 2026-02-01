package com.tico.mypawday.walk.infrastructure.repository;

import com.tico.mypawday.walk.domain.entity.WalkMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * WalkMedia JPA Repository
 */
@Repository
public interface JpaWalkMediaRepository extends JpaRepository<WalkMedia, UUID> {
}