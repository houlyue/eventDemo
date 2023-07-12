/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.producermodule.web;

import com.example.commonmodule.utils.BeanMethodEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Controller
public class ProducerController {

    //注入publisher，用于发布事件
    @Autowired
    private ApplicationEventPublisher publisher;

    @RequestMapping("/producer")
    @ResponseBody
    public String producer() {
        publisher.publishEvent(BeanMethodEvent.create(new Object[]{"我是谁", "111"},
                "consumer", "test"));
//        publisher.publishEvent(new ApplicationEvent("自定义发布事件") {});
        return "1";
    }
}
