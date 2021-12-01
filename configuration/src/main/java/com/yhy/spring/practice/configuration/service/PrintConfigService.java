package com.yhy.spring.practice.configuration.service;

import com.yhy.spring.practice.configuration.config.MyConfig;
import com.yhy.spring.practice.configuration.config.MyConfig2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PrintConfigService implements ApplicationRunner {
    @Autowired
    private MyConfig myConfig;
    @Autowired
    private MyConfig2 myConfig2;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("myConfig:{}", myConfig);
        log.info("myConfig2:{}", myConfig2);
    }

}
