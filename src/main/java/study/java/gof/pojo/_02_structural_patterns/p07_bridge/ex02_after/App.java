package study.java.gof.pojo._02_structural_patterns.p07_bridge.ex02_after;

public class App {
    public static void main(String[] args) {
        OSCommand winCommand = new WindowOS(new WindowKey());

        winCommand.copy();
        winCommand.paste();

        OSCommand macCommand = new MacOS(new MacKey());

        macCommand.copy();
        macCommand.paste();

        OSCommand winUsingMacKey = new WindowOS(new MacKey());
        winUsingMacKey.copy();
        winUsingMacKey.paste();
    }
}
