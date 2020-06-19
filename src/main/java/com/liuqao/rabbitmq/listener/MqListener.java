package com.liuqao.rabbitmq.listener;

import com.liuqao.rabbitmq.config.RabbitMqConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: RabbitListener
 * @Description: TODO
 * @Author liuqiao
 * @Date 2020/6/19
 */
@Component
public class MqListener {
    
    @RabbitListener(queues = {RabbitMqConfig.TEST_QUEUE})
    public void testListener(String msg){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(msg);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
