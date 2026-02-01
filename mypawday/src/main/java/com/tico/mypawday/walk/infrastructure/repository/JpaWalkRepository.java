package com.tico.mypawday.walk.infrastructure.repository;

import com.tico.mypawday.walk.domain.entity.Walk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Walk JPA Repository
 */
@Repository
public interface JpaWalkRepository extends JpaRepository<Walk, UUID> {
}