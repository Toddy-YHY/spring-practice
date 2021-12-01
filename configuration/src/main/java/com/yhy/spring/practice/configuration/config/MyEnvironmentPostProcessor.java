package com.yhy.spring.practice.configuration.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.Assert;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yanhy
 */
@Slf4j
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {

    @SneakyThrows
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        Path configPath = Paths.get("E:\\application.properties");
        MutablePropertySources propertySources = environment.getPropertySources();

        Assert.isTrue(Files.exists(configPath), "外部配置文件不存在" + configPath);

        FileSystemResource resource = new FileSystemResource(configPath);
        Properties myProperties = PropertiesLoaderUtils.loadProperties(resource);

        //加入
        propertySources.addFirst(new PropertiesPropertySource("myProperties", myProperties));
        log.info("加载配置文件：{}", configPath);
    }
}
