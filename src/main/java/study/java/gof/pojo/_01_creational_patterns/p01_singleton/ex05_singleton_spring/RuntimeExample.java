package study.java.gof.pojo._01_creational_patterns.p01_singleton.ex05_singleton_spring;

public class RuntimeExample {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
