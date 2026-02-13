package com.tico.mypawday.walk.domain.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 컨디션 Value Object
 */
@Getter
@RequiredArgsConstructor
public enum Condition {
    GOOD("좋음"),
    NORMAL("보통"),
    BAD("나쁨");

    private final String description;

    public static Condition from(String value) {
        if (value == null) {
            throw new IllegalArgumentException("컨디션은 필수입니다.");
        }
        try {
            return Condition.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("유효하지 않은 컨디션입니다: " + value);
        }
    }
}