package com.brian.fastblog.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author brian
 * @date 2020/6/24
 */
@Configuration
@MapperScan("com.brian.fastblog.mapper")
public class MybatisPlusConfig {

}