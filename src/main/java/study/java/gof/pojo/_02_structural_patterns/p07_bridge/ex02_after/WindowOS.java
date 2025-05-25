package study.java.gof.pojo._02_structural_patterns.p07_bridge.ex02_after;

public class WindowOS extends DefaultOSCommand {
    public WindowOS(OSKey osKey) {
        super(osKey, "윈도우");
    }
}
