package com.ihason.examples.spring.batch.amqp.manager.config;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Configuration;

@EnableBatchProcessing
@Configuration(proxyBeanMethods = false)
public class BatchConfig {
}
