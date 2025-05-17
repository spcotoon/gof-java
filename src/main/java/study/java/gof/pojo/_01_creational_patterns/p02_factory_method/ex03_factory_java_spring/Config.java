package study.java.gof.pojo._01_creational_patterns.p02_factory_method.ex03_factory_java_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String hello() {
        return "hello";
    }
}
