package com.naver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy // AOP 활성화
public class MyTinyClientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyTinyClientApplication.class, args);
    }

    private MyTimerService myService;

    public MyTinyClientApplication(MyTimerService myService) {
        this.myService = myService;
    }

    @Override
    public void run(String ...arg) throws Exception{
        System.out.println("--- 테스트 시작 ---");
        myService.heavyTask();
        System.out.println("--- 테스트 종료 ---");
    }

}
