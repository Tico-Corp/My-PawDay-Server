package com.tico.mypawday.pet.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * 반려동물 엔티티
 */
@Getter
@Entity
@Table(name = "p_pets")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "pet_id")
    private UUID petId;
}