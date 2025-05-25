package study.java.gof.pojo._02_structural_patterns.p07_bridge.ex01_before;

public class MacOS implements OSCommand {
    @Override
    public void copy() {
        System.out.println("맥 Cmd + c");
    }

    @Override
    public void paste() {
        System.out.println("맥 Cmd + v");
    }
}
