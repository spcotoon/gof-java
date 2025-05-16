package study.java.gof.pojo.singleton.ex03_attack_ex01_ex02;

public class App {
    public static void main(String[] args) {

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
