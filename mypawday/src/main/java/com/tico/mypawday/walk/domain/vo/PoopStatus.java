package com.tico.mypawday.walk.domain.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 변 상태 Value Object
 */
@Getter
@RequiredArgsConstructor
public enum PoopStatus {
    NONE("배변 안 함"),
    NORMAL("정상"),
    SOFT("묽음"),
    HARD("딱딱함"),
    DIARRHEA("설사"),
    BLOODY("혈변"),
    CUSTOM("기타");

    private final String description;

    public static PoopStatus from(String value) {
        if (value == null || value.isBlank()) {
            return null;
        }
        try {
            return PoopStatus.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("유효하지 않은 배변 상태입니다: " + value);
        }
    }
}