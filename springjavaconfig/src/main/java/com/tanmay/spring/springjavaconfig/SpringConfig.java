package com.tanmay.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration //Tells spring that this class is a spring configuration
@Import(DaoConfig.class) //importing some other configuration
public class SpringConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Scope("singleton")
    public Service service() {
        return new Service();
    }
}
