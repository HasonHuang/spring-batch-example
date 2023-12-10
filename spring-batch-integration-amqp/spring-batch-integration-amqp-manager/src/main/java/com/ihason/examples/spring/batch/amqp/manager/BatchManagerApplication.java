package com.ihason.examples.spring.batch.amqp.manager;

import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 批处理任务 Manager
 *
 * @author Hason
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BatchManagerApplication {

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private RabbitMessagingTemplate messagingTemplate;

    public static void main(String[] args) {
        SpringApplication.run(BatchManagerApplication.class, args);
    }

}
