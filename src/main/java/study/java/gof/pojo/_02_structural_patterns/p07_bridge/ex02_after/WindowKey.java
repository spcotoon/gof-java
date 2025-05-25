package study.java.gof.pojo._02_structural_patterns.p07_bridge.ex02_after;

public class WindowKey implements OSKey{
    @Override
    public String getName() {
        return "Ctrl";
    }
}
