package com.java.thread.create.concurrency;

import java.text.MessageFormat;

public class SubTaskWithLambda {
    public void run() {
        Runnable task = () -> System.out.printf(MessageFormat.format("start: {0}\n", this.getClass().getSimpleName()));
    }
}
