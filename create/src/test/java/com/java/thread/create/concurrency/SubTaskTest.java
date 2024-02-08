package com.java.thread.create.concurrency;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

public class SubTaskTest {

    @Test
    public void start() {
        new SubTask().start();
    }
}
