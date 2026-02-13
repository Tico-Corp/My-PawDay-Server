package com.tico.mypawday.walk.domain.entity;

import com.tico.mypawday.global.entity.BaseEntity;
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
public class WalkMedia extends BaseEntity {

    @Id
    @Column(name = "media_id", nullable = false, updatable = false)
    private UUID mediaId;  // 미디어 도메인 ID를 PK로 사용

    @Column(name = "display_order", nullable = false)
    private int displayOrder;

    // walk_id는 Walk 엔티티의 @JoinColumn으로 관리됨
}