package com.lisanboot.helloBoot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
//如果使用我们的RestController进行注解Controller，return无法使用InteneResourceViewResolver （试图解析器）

public class HelloWorldController {

    @RequestMapping("h")
    public @ResponseBody String hello() {
        return "hello world";
    }

    @RequestMapping("test")
    public String testThymeleaf(Map<String, Object> map) {
        map.put("test", "welcomeeeeeeeeeeeee");
        return "test";
    }

}
