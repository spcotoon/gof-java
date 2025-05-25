package study.java.gof.pojo._02_structural_patterns.p07_bridge.ex01_before;

public class WindowOS implements OSCommand {
    @Override
    public void copy() {
        System.out.println("윈도우 Ctrl + c");
    }

    @Override
    public void paste() {
        System.out.println("윈도우 Ctrl + v");
    }
}
