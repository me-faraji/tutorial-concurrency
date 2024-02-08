package com.java.thread.start.concurrency;

import org.junit.Test;

public class SubTaskWithRunnableTest {
    @Test
    public void start() {
        Thread subTask = new Thread(new SubTaskWithRunnable());
        subTask.start();
    }
}
