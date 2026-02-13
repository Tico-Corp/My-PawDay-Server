package com.tico.mypawday.pet.domain.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Species {
    DOG("강아지"),
    CAT("고양이");

    private final String description;

    public static Species from(String value) {
        if (value == null) {
            throw new IllegalArgumentException("종족은 필수입니다.");
        }
        try {
            return Species.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("유효하지 않은 종족입니다: " + value);
        }
    }
}