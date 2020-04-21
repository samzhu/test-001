package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
	
	@Scheduled(fixedRate = 5000)
    public void task() {
        System.out.println("每隔5秒執行一次");
    }

}
