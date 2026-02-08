package com.tico.mypawday.pet.domain.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Gender {
    MALE("수컷"),
    FEMALE("암컷");

    private final String description;

    public static Gender from(String value) {
        try {
            return Gender.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("유효하지 않은 성별입니다: " + value);
        }
    }
}