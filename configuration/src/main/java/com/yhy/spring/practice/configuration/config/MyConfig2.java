package com.yhy.spring.practice.configuration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "my2")
public class MyConfig2 {

    private String foo;

}
