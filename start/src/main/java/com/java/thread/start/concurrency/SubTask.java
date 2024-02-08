package com.java.thread.start.concurrency;

import java.text.MessageFormat;

public class SubTask extends Thread {
    public void run() {
        System.out.printf(MessageFormat.format("start: {0}\n", this.getClass().getSimpleName()));
    }
}
