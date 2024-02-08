package com.java.thread.start.concurrency;

import org.junit.Test;

import java.text.MessageFormat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {
    @Test
    public void subTask() throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);
        es.execute(new SubTask());
        es.execute(new SubTaskWithRunnable());
        Future<String> callableResult = es.submit(new SubTaskWithCallable());
        es.execute(new SubTaskWithLambda().create());
        es.execute(() -> System.out.printf(MessageFormat.format("stat: with runnable {0}\n", "internal")));
        System.out.printf(callableResult.get());
    }

}
