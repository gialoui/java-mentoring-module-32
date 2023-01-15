package com.epam.controller;

import com.epam.serviceClient.OneServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author khangndd
 */
@RestController
@RequestMapping("/two")
@Slf4j
public class TwoController {
    @Autowired
    private OneServiceClient oneServiceClient;

    @GetMapping("/health-check")
    String healthCheck() {
        return "I'm good";
    }

    @GetMapping
    String test() {
        log.info("Result from another service: {}", oneServiceClient.healthCheck());
        return "Two App";
    }
}
