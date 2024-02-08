package com.java.thread.start.concurrency;

import java.text.MessageFormat;
import java.util.concurrent.Callable;

public class SubTaskWithCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        long sleep = 1000;
        Thread.sleep(sleep);
        return MessageFormat.format("Result after {0} mSec\n", sleep);
    }
}
