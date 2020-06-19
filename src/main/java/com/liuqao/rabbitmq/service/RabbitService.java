package com.liuqao.rabbitmq.service;

import com.liuqao.rabbitmq.config.RabbitMqConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: RabbitService
 * @Description: TODO
 * @Author liuqiao
 * @Date 2020/6/19
 */
@Service
public class RabbitService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String msg) {
        rabbitTemplate.convertAndSend(RabbitMqConfig.TEST_QUEUE,"This is msg:"+msg );
    }
}
