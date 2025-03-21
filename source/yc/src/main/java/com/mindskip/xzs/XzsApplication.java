package com.mindskip.xzs;


import com.mindskip.xzs.configuration.property.SystemConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @version 3.5.0
 * @description: The type Xzs application.
 * Copyright (C), 2020-2024, 武汉思维跳跃科技有限公司
 * @date 2021/12/25 9:45
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableConfigurationProperties(value = { SystemConfig.class})
@MapperScan("com.mindskip.xzs.repository")
public class  XzsApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(XzsApplication.class, args);
    }
}

