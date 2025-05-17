package study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex03_abstract_factory_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {

    @Bean
    public ExamFactory examFactory() {
        return new ExamFactory();
    }
}
