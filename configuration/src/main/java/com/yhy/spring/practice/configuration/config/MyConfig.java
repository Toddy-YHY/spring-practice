package com.yhy.spring.practice.configuration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

import java.util.List;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "my")
public class MyConfig {

    private String foo;

}
