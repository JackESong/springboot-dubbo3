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
 * @Create Date:  2021/6/21 10:21 上午
 * <p>
 * @Modified By: naton
 * <p>
 * @Modified Date:  2021/6/21 10:21 上午
 * <p>
 * @Why & What is modified: <修改原因描述>
 * <p>
 * @Version: v1.0
 */
import com.example.demo.ProviderConfiguration;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.concurrent.CountDownLatch;

public class ProviderBootstrap {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }


}

