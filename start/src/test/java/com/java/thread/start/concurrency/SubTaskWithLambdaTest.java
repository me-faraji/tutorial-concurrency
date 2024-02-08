package com.java.thread.start.concurrency;

import org.junit.Test;

public class SubTaskWithLambdaTest {
    @Test
    public void start() {
        new SubTaskWithLambda().create().run();
    }
}
