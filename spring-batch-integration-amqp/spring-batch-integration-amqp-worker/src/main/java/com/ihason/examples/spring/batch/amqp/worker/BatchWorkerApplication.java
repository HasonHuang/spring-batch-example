package com.ihason.examples.spring.batch.amqp.worker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 批处理 worker
 *
 * @author Hason
 */
@SpringBootApplication
public class BatchWorkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatchWorkerApplication.class, args);
    }

}
