package com.example.lombok.features;

import lombok.Getter;
import lombok.NonNull;

public class NonNullExample {

    @Getter
    private String name;

    public NonNullExample(@NonNull String name) {
        this.name = name;
    }

}
