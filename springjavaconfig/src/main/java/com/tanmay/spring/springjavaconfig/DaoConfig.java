package com.tanmay.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {

    //This is similar to creating bean in config.xml
    @Bean
    public Dao dao() {
        return new Dao();
    }
}
