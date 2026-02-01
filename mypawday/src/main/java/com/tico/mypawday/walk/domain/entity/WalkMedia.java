package com.tico.mypawday.walk.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * 산책 미디어 엔티티
 */
@Getter
@Entity
@Table(name = "p_walk_media")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WalkMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "media_id")
    private UUID mediaId;
}