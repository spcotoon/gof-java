package study.java.gof.pojo.singleton.ex01_simple;

public class App {
    public static void main(String[] args) {
        Settings settings = Settings.getInstance();
        Settings settings1 = Settings.getInstance();

        System.out.println(settings == settings1);
        Thread t1 = new Thread(() -> {
            Settings s1 = Settings.getInstanceThreadSafe();
            System.out.println("Thread 1: " + s1);
        });

        Thread t2 = new Thread(() -> {
            Settings s2 = Settings.getInstanceThreadSafe();
            System.out.println("Thread 1: " + s2);
        });

        t1.start();
        t2.start();

    }
}
