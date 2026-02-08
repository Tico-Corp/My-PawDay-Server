package com.tico.mypawday.pet.domain.entity;

import com.tico.mypawday.global.entity.BaseEntity;
import com.tico.mypawday.pet.domain.vo.Gender;
import com.tico.mypawday.pet.domain.vo.Species;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

/**
 * 반려동물 엔티티
 */
@Getter
@Entity
@Table(name = "p_pets")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Pet extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "pet_id", nullable = false, updatable = false)
    private UUID petId;

    @Column(name = "user_id", nullable = false, updatable = false)
    private UUID userId;

    @Column(name = "name", nullable = false, length = 15)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "species", nullable = false, length = 10)
    private Species species;

    @Column(name = "breed_id")
    private Long breedId;

    // breed_id가 NULL일 때만 사용
    @Column(name = "custom_breed", length = 50)
    private String customBreed;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false, length = 10)
    private Gender gender;

    @Column(name = "neutered", nullable = false)
    private boolean neutered;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "weight", precision = 5, scale = 1)
    private BigDecimal weight;

    @Column(name = "image_id")
    private UUID imageId;

    @Column(name = "notes", length = 200)
    private String notes;
}