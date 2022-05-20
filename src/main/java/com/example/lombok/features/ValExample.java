package com.example.lombok.features;

import lombok.val;
import java.util.ArrayList;
import java.util.List;

public class ValExample {

    public static List getValue() {
        val values = new ArrayList<String>();
        values.add("fire");
        values.add("water");
        return values;
    }
}
