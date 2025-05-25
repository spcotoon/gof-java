package study.java.gof.pojo._02_structural_patterns.p07_bridge.ex01_before;

public class App {
    public static void main(String[] args) {
        WindowOS windowOS = new WindowOS();
        windowOS.copy();
        windowOS.paste();

        MacOS macOS = new MacOS();
        macOS.copy();
        macOS.paste();
    }
}
