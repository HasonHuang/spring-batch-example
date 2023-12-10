package com.ihason.examples.spring.batch.amqp.worker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 批处理 worker
 *
 * @author Hason
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BatchWorkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatchWorkerApplication.class, args);
    }

}
