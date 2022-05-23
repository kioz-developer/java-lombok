package com.example.lombok.features;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;

@Builder
@Data
public class BuilderExample {

    private String name;
    private String address;
    private LocalDate dayOfBirth;

}
