package com.example.demo.sample;

/**
 * <p>
 *
 * @CopyRright (c) NaTon
 * <p>
 * @Project: Dubbo3Demo
 * @Comments: <p>
 * @Package: com.example.dubbo3demo
 * <p>
 * @Author: naton
 * <p>
 * @Create Date:  2021/6/21 10:20 上午
 * <p>
 * @Modified By: naton
 * <p>
 * @Modified Date:  2021/6/21 10:20 上午
 * <p>
 * @Why & What is modified: <修改原因描述>
 * <p>
 * @Version: v1.0
 */
import com.example.demo.ConsumerConfiguration;
import com.example.demo.action.GreetingServiceConsumer;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

public class ConsumerBootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        GreetingServiceConsumer greetingServiceConsumer = context.getBean(GreetingServiceConsumer.class);
        String hello = greetingServiceConsumer.doSayHello("zookeeper");
        System.out.println("result: " + hello);
    }


}