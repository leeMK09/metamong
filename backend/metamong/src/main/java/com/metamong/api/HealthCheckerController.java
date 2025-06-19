package com.metamong.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckerController {
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
