package com.naver;

import com.naver.aspect.Timer;
import org.springframework.stereotype.Service;

@Service
public class MyTimerService {
    @Timer
    public void heavyTask() throws InterruptedException {
        System.out.println("비즈니스 로직 실행중...");
        Thread.sleep(500);
    }
}
