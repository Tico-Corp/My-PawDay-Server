package com.tico.mypawday.walk.domain.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 날씨 Value Object
 */
@Getter
@RequiredArgsConstructor
public enum Weather {
    SUNNY("맑음"),
    CLOUDY("흐림"),
    RAINY("비"),
    SNOWY("눈"),
    WINDY("바람"),
    LIGHTNING("천둥번개");

    private final String description;

    public static Weather from(String value) {
        if (value == null || value.isBlank()) {
            return null;
        }
        try {
            return Weather.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("유효하지 않은 날씨입니다: " + value);
        }
    }
}