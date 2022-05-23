package com.example.lombok.features;

import lombok.SneakyThrows;

public class SneakyThrowsExample implements Runnable {

    @SneakyThrows
    public String utf8ToString(byte[] bytes) {
        return new String(bytes, "UTF-8");
    }

    @SneakyThrows
    public void run() {
        throw new Throwable();
    }
}
