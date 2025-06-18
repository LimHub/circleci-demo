package com.lhw.circle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcircle {

    @GetMapping("/circle")
    public String circle() {
        return "circle";
    }
}
