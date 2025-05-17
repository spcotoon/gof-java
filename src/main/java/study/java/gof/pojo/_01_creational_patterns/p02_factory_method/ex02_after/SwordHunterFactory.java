package study.java.gof.pojo._01_creational_patterns.p02_factory_method.ex02_after;

public class SwordHunterFactory implements HunterFactory{

    @Override
    public Hunter createHunter(String name) {
        return new SwordMan(name);
    }
}
