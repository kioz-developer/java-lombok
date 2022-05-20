package com.example.lombok.features;

import lombok.Cleanup;
import java.io.IOException;
import java.nio.channels.Selector;

public class CleanupExample {

    public static Selector readAll() throws IOException {
        @Cleanup Selector selector = Selector.open();
        return selector;
    }
}
