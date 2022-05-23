package com.example.lombok.features;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.With;

@AllArgsConstructor
@ToString
public class WithExample {

    @With
    private String name;

}
