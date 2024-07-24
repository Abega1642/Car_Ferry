package dev.razafindratelo.exo8;

import lombok.Getter;

@Getter
public enum RoomType {
    SIMPLE(1),
    DOUBLE(2),
    VIP(3);

    private final int value;

    RoomType(int value) {
        this.value = value;
    }
}
