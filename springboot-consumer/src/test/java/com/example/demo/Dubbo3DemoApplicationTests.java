package com.example.demo;

import com.example.demo.action.GreetingServiceConsumer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@WebAppConfiguration
class Dubbo3DemoApplicationTests {

    @Autowired
    GreetingServiceConsumer greetingServiceConsumer;

    @Test
    void contextLoads() {
        String hello = greetingServiceConsumer.doSayHello("123");
        System.out.println("result: " + hello);
    }

}
