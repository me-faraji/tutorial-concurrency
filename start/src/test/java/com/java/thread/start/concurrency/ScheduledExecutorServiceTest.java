package com.java.thread.start.concurrency;

import org.junit.Test;

import java.text.MessageFormat;
import java.util.concurrent.*;

public class ScheduledExecutorServiceTest {

    @Test
    public void subTask() throws ExecutionException, InterruptedException {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(10);
        ses.schedule(new SubTask(), 1, TimeUnit.SECONDS).get();

        ses.schedule(new SubTaskWithRunnable(), 1, TimeUnit.SECONDS).get();

        ScheduledFuture<String> resultCallable = ses.schedule(new SubTaskWithCallable(), 1, TimeUnit.SECONDS);
        System.out.printf(resultCallable.get());

        ses.schedule(new SubTaskWithLambda().create(), 1, TimeUnit.SECONDS).get();

        ScheduledFuture<String> resultInternal = ses.schedule(() -> MessageFormat.format("stat: with runnable {0}\n"
                        , "internal")
                , 1, TimeUnit.SECONDS);
        System.out.printf(resultInternal.get());
    }
}
