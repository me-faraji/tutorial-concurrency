package com.java.thread.create.concurrency;

import org.junit.Test;

public class SubTaskWithLambdaTest {
    @Test
    public void start() {
        new SubTaskWithLambda().run();
    }
}
