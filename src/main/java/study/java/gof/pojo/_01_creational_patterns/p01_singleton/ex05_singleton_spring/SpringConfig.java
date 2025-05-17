package study.java.gof.pojo._01_creational_patterns.p01_singleton.ex05_singleton_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public String hello() {
        return "hello";
    }
}
