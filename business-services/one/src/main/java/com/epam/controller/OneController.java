package com.epam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author khangndd
 */
@RestController
@RequestMapping("/one")
public class OneController {

    @GetMapping
    String test() {
        return "One App";
    }
}
