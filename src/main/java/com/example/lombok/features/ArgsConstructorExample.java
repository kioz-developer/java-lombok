package com.example.lombok.features;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class ArgsConstructorExample {

    @NonNull
    private String name;
    
    private Integer age;
}
