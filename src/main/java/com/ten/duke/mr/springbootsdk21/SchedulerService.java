package com.ten.duke.mr.springbootsdk21;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerService {
    private static final Logger log = LoggerFactory.getLogger(SchedulerService.class);

    @Scheduled(fixedDelayString = "15000")
    public void run() {
        log.info("Scheduled method has been called {}", Thread.currentThread());
    }
}
