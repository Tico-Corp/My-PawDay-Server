package com.tico.mypawday.walk.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * 산책 반려동물 엔티티
 */
@Getter
@Entity
@Table(name = "p_walk_pets")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WalkPet {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "walk_pet_id")
    private UUID walkPetId;
}