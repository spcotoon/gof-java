package study.java.gof.pojo.singleton.ex05_singleton_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        //싱글톤 패턴은 아니지만 @Bean 어노테이션으로 싱글톤 스코프로 관리되게함

        String hello = applicationContext.getBean("hello", String.class);
        String hello2 = applicationContext.getBean("hello", String.class);

        System.out.println(hello == hello2);


    }
}
