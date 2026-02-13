package com.tico.mypawday.walk.domain.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 배변 정보 Value Object
 */
@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PoopInfo {

    @Enumerated(EnumType.STRING)
    @Column(name = "poop_status", length = 20)
    private PoopStatus poopStatus;

    @Column(name = "custom_poop_status", length = 50)
    private String customPoopStatus;

    @Column(name = "poop_notes", length = 100)
    private String poopNotes;
}