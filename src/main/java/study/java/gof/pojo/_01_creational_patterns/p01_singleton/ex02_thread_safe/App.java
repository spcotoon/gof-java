package study.java.gof.pojo._01_creational_patterns.p01_singleton.ex02_thread_safe;

public class App {
    public static void main(String[] args) {
        Settings settings = Settings.getInstance();
        Settings settings1 = Settings.getInstance();

        System.out.println(settings == settings1);
        Thread t1 = new Thread(() -> {
            Settings s1 = Settings.getInstance();
            System.out.println("Thread 1: " + s1);
        });

        Thread t2 = new Thread(() -> {
            Settings s2 = Settings.getInstance();
            System.out.println("Thread 1: " + s2);
        });

        t1.start();
        t2.start();

        Settings2 settings2 = Settings2.getInstance();
        Settings2 settings12 = Settings2.getInstance();

        System.out.println(settings2 == settings12);
        Thread t3 = new Thread(() -> {
            Settings2 s1 = Settings2.getInstance();
            System.out.println("Thread 1: " + s1);
        });

        Thread t4 = new Thread(() -> {
            Settings2 s2 = Settings2.getInstance();
            System.out.println("Thread 1: " + s2);
        });

        t3.start();
        t4.start();

    }
}
