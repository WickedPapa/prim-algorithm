package com.exercise.prim_algorithm.configuration;

import com.exercise.prim_algorithm.service.PrimService;
import com.exercise.prim_algorithm.service.PrimServiceImpl;
import com.exercise.prim_algorithm.service.PrimServicePriorityQueueImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(PrimProperties.class)
public class BeanConfig {

    @Bean
    public PrimService primService(PrimProperties properties) {
        return switch (properties.implementation()) {
            case SIMPLE -> new PrimServiceImpl();
            case PRIORITY_QUEUE -> new PrimServicePriorityQueueImpl();
        };
    }
}
