package com.tico.mypawday.pet.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
    @Column(name = "breed_id")
    private Long breedId;
}