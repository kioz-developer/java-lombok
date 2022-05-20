package com.example.lombok.features;

//import lombok.var;
import java.util.HashMap;
import java.util.Map;

public class VarExample {

    public static Map getValue() {
        var values = new HashMap<String, String>();
        values.put("latitude", "-21.00508");
        values.put("longitude", "45.85421");
        return values;
    }
}
