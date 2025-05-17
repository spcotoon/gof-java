package study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex03_abstract_factory_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before.Hunter;

public class FactoryBeanExample {

    public static void main(String[] args) {
        /**
         * 스프링 내부의 FactoryBean<T> 코드를 변경하는게 아니고
         * ExampleFactory 로 구현하여 사용(확장)
         */

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);

        Hunter bean = applicationContext.getBean(Hunter.class);

        System.out.println(bean);
    }

}
