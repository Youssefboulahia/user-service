package com.example.user.user_service.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class selfPingScheduler {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final Logger logger = LoggerFactory.getLogger(selfPingScheduler.class);

    // Runs every 5 minutes (300,000 milliseconds)
    @Scheduled(fixedRate = 300000)
    public void pingSelf() {
        String url = "https://user-service-f8c4.onrender.com/users/bouza";  // or your service URL

        try {
            restTemplate.getForObject(url, String.class);
            System.out.println("Pinged self successfully");
            logger.info("Scheduled pingSelf() is running...");
        } catch (Exception e) {
            System.err.println("Failed to ping self: " + e.getMessage());
            logger.info("Scheduled pingSelf() failed");
        }
    }
}

