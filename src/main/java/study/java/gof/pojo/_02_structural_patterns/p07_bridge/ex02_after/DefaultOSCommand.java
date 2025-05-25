package study.java.gof.pojo._02_structural_patterns.p07_bridge.ex02_after;

public class DefaultOSCommand implements OSCommand {
    private String name;

    private OSKey osKey;

    public DefaultOSCommand(OSKey osKey, String name) {
        this.osKey = osKey;
        this.name = name;
    }

    @Override
    public void copy() {
        System.out.printf("%s %s + c\n", this.name, osKey.getName());
    }

    @Override
    public void paste() {
        System.out.printf("%s %s + v\n", this.name, osKey.getName());
    }
}
