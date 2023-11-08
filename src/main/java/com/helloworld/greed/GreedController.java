package com.helloworld.greed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreedController {
    @GetMapping("/greed")
    public String greed() {

        return "Hello Worldaaa";
    }
}
