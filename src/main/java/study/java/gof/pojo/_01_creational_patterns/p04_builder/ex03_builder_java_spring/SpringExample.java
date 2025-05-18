package study.java.gof.pojo._01_creational_patterns.p04_builder.ex03_builder_java_spring;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {
    public static void main(String[] args) {
        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.ryu.me")
                .path("java")
                .build()
                .encode();

        System.out.println(uri);
    }
}
