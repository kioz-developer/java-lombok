package com.example.lombok.features;

import lombok.Data;
import lombok.NonNull;

@Data
public class DataExample {

    @NonNull
    private String name;
    private Integer age;
}
