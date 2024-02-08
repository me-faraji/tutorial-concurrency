package com.java.thread.create.concurrency;

import java.text.MessageFormat;

public class SubTaskWithRunnable implements Runnable {
    @Override
    public void run() {
        System.out.printf(MessageFormat.format("start: {0}\n", this.getClass().getSimpleName()));
    }
}
