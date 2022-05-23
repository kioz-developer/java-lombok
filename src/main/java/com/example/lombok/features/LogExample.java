package com.example.lombok.features;

import lombok.extern.java.Log;

@Log
public class LogExample {

    public void print() {
        log.info("Log message");
    }
}
