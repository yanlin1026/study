package com.rabbit.Controller;

import com.rabbit.consumer.RabbitMQConsumer;
import com.rabbit.provider.RabbitMQProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: yanlin
 * Date: 2018/8/22 16:57
 * Description:
 */
@RestController
@RequestMapping("/rabbit")
public class RabbitController {
    @Autowired
    private RabbitMQProvider rabbitMQProvider;

    @RequestMapping("/hello")
    public String hello() {
        rabbitMQProvider.send();
        return "chenggong";
    }


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        System.out.println("test");
        return "test";
    }
}
