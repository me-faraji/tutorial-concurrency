package com.java.thread.start.concurrency;

import java.text.MessageFormat;

public class SubTaskWithLambda {
    public Runnable create() {
        return () -> System.out.printf(MessageFormat.format("start: {0}\n", this.getClass().getSimpleName()));
    }
}
