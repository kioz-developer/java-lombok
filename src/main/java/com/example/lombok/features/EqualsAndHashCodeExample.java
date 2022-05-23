package com.example.lombok.features;

import lombok.EqualsAndHashCode;
import java.time.LocalDate;

@EqualsAndHashCode
public class EqualsAndHashCodeExample {

    private String log;
    private LocalDate started;

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public LocalDate getStarted() {
        return started;
    }

    public void setStarted(LocalDate started) {
        this.started = started;
    }
}
