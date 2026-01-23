package com.exercise.prim_algorithm.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "prim")
public record PrimProperties(PrimImplementation implementation) {}