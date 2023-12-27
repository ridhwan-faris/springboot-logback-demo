package com.ridhwan.logbackdemo.controller;

import com.ridhwan.logbackdemo.common.model.web.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public BaseResponse<?> hello() {
        Map<String, String> res = new HashMap<>();
        res.put("tes", "tess");
        log.info("logback demo using kafka appender");
        return BaseResponse.sendSuccess(res);
    }
}
