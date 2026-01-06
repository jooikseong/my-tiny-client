package com.naver.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class AdviceController {

    @GetMapping("/hello")
    public Map<String, String> hello(){
        return Map.of("message","hello");
    }
}
