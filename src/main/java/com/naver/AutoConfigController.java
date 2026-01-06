package com.naver;

import com.naver.autoconfig.MyExternalClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AutoConfigController {

    private final MyExternalClient myExternalClient;

    @GetMapping("/api-test")
    public String apiTest(){
        return myExternalClient.callApi("안녕하세요 알림톡입니다.");
    }

}
