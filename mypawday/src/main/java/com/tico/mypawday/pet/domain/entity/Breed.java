package com.tico.mypawday.pet.domain.entity;

import com.tico.mypawday.pet.domain.vo.Species;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 반려동물 품종 엔티티
 */
@Getter
@Entity
@Table(name = "p_pet_breeds")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Breed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "breed_id", nullable = false, updatable = false)
    private Long breedId;

    @Enumerated(EnumType.STRING)
    @Column(name = "species", nullable = false, length = 10)
    private Species species;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "active", nullable = false)
    private boolean active = true;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
}