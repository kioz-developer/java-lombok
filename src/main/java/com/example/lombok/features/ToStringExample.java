package com.example.lombok.features;

import lombok.Data;
import lombok.ToString;
import java.time.LocalDate;

@ToString
public @Data class ToStringExample {

    private String name;
    private LocalDate dateOfBirth;

}
