package com.liuqao.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: RabbitMqConfig
 * @Description: TODO
 * @Author liuqiao
 * @Date 2020/6/19
 */
@Configuration
public class RabbitMqConfig {
    public static final String TEST_QUEUE = "test";

    @Bean(TEST_QUEUE)
    public Queue queue(){
        return new Queue(TEST_QUEUE);
    }
}
