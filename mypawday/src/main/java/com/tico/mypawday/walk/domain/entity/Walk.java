package com.tico.mypawday.walk.domain.entity;

import com.tico.mypawday.global.entity.BaseEntity;
import com.tico.mypawday.walk.domain.vo.PoopInfo;
import com.tico.mypawday.walk.domain.vo.Weather;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 산책 일기 엔티티
 */
@Getter
@Entity
@Table(name = "p_walks")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Walk extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "walk_id", nullable = false, updatable = false)
    private UUID walkId;

    @Column(name = "user_id", nullable = false, updatable = false)
    private UUID userId;

    @Column(name = "walk_date", nullable = false)
    private LocalDate walkDate;

    @Column(name = "start_time", nullable = false)
    private LocalTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalTime endTime;

    @Column(name = "crossed_midnight", nullable = false)
    private boolean crossedMidnight = false;

    @Enumerated(EnumType.STRING)
    @Column(name = "weather", length = 20)
    private Weather weather;

    @Column(name = "route_description", length = 150)
    private String routeDescription;

    @Embedded
    private PoopInfo poopInfo;

    @Column(name = "friends_met", length = 100)
    private String friendsMet;

    @Column(name = "notes", length = 150)
    private String notes;

    @Column(name = "meals_snacks", length = 150)
    private String mealsSnacks;

    @Column(name = "diary", columnDefinition = "TEXT")
    private String diary;

    // 단방향 연관관계
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "walk_id")
    private List<WalkPet> walkPets = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "walk_id")
    @OrderBy("displayOrder ASC")
    private List<WalkMedia> walkMediaList = new ArrayList<>();
}