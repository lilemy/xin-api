package com.lilemy.xinapi;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 主类（项目启动入口）
 */
// todo 如需开启 Redis，须移除 exclude 中的内容
@SpringBootApplication()
@MapperScan("com.lilemy.xinapi.mapper")
@EnableDubbo
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class XinApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(XinApiApplication.class, args);
    }

}
