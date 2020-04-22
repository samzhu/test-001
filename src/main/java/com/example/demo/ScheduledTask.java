package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ScheduledTask {
	
	@Scheduled(fixedRate = 1000)
    public void task() {
        log.info("每隔5秒執行一次");
    }

}
