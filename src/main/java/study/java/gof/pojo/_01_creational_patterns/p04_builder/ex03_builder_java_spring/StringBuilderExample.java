package study.java.gof.pojo._01_creational_patterns.p04_builder.ex03_builder_java_spring;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        String result = stringBuilder.append("hello ").append("java").toString();
        System.out.println(result);

    }
}
