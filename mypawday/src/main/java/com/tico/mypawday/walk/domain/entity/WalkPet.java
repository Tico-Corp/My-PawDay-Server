package com.tico.mypawday.walk.domain.entity;

import com.tico.mypawday.global.entity.BaseEntity;
import com.tico.mypawday.walk.domain.vo.Condition;
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
public class WalkPet extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "walk_pet_id", nullable = false, updatable = false)
    private UUID walkPetId;

    @Column(name = "pet_id", nullable = false, updatable = false)
    private UUID petId;

    @Column(name = "pet_name", nullable = false, length = 15)
    private String petName;

    @Enumerated(EnumType.STRING)
    @Column(name = "condition", nullable = false, length = 10)
    private Condition condition;

    // walk_id는 Walk 엔티티의 @JoinColumn으로 관리됨
}