package com.bocom.jwj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author qy
 * MapperScan  配置的是dao层的包路径
 * EnableTransactionManagement 事务开关加了这个  @Transactional 这个注解才生效
 *
 */
@MapperScan("com.bocom.jwj.dao")
@EnableTransactionManagement
@SpringBootApplication
public class JwjApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwjApplication.class, args);
    }
}
