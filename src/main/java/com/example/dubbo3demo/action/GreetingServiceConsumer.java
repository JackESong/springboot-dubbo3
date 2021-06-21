package com.example.dubbo3demo.action;

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
 * @Create Date:  2021/6/21 10:17 上午
 * <p>
 * @Modified By: naton
 * <p>
 * @Modified Date:  2021/6/21 10:17 上午
 * <p>
 * @Why & What is modified: <修改原因描述>
 * <p>
 * @Version: v1.0
 */
/*
 *
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

import com.example.dubbo3demo.api.GreetingService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component("annotatedConsumer")
public class GreetingServiceConsumer {

    @DubboReference(version = "1.0.0")
    private GreetingService greetingService;

    public String doSayHello(String name) {
        return greetingService.sayHello(name);
    }

}
