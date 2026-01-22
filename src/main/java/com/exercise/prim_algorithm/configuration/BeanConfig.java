package com.exercise.prim_algorithm.configuration;

import com.exercise.prim_algorithm.service.PrimService;
import com.exercise.prim_algorithm.service.PrimServicePriorityQueueImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public PrimService primService() {
//        return new PrimServiceImpl();
        return new PrimServicePriorityQueueImpl();
    }
}
