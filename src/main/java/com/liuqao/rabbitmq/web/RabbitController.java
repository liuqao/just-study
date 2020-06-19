package com.liuqao.rabbitmq.web;

import com.liuqao.rabbitmq.service.RabbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: RabbitController
 * @Description: TODO
 * @Author liuqiao
 * @Date 2020/6/19
 */
@RestController
@RequestMapping("rabbit")
public class RabbitController {

    @Autowired
    private RabbitService rabbitService;

    @GetMapping("/{msg}")
    public String send(@PathVariable String msg){
        rabbitService.send(msg);
        return "消息发送成功";
    }
}
