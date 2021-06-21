package com.example.demo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * <p>
 *
 * @CopyRright (c) NaTon
 * <p>
 * @Project: springboot-dubbo3
 * @Comments: <p>
 * @Package: com.example.demo
 * <p>
 * @Author: naton
 * <p>
 * @Create Date:  2021/6/21 11:25 上午
 * <p>
 * @Modified By: naton
 * <p>
 * @Modified Date:  2021/6/21 11:25 上午
 * <p>
 * @Why & What is modified: <修改原因描述>
 * <p>
 * @Version: v1.0
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.example.demo.impl")
//@PropertySource("classpath:/dubbo-provider.properties")
@PropertySource("classpath:/application.properties")
public class ProviderConfiguration {
}
