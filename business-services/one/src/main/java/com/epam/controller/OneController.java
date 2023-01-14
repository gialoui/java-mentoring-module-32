package com.epam.controller;

import com.epam.serviceClient.TwoServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author khangndd
 */
@RestController
@RequestMapping("/one")
@Slf4j
public class OneController {

    @Autowired
    private TwoServiceClient twoServiceClient;

    @GetMapping
    String test() {
        log.info("Result from another service: {}", twoServiceClient.test());
        return "One App";
    }
}
