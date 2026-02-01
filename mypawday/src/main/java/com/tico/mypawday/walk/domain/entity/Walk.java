package com.tico.mypawday.walk.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * 산책 일기 엔티티
 */
@Getter
@Entity
@Table(name = "p_walks")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Walk {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "walk_id")
    private UUID walkId;
}