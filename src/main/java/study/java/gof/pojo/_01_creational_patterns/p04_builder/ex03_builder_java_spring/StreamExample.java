package study.java.gof.pojo._01_creational_patterns.p04_builder.ex03_builder_java_spring;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        Stream.Builder<String> stringStreambuilder = Stream.builder();
        Stream<String> stream = stringStreambuilder.add("hello ").add("java").build();

        stream.forEach(System.out::println);
    }
}
