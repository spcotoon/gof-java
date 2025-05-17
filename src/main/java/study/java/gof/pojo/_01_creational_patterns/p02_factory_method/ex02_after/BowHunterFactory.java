package study.java.gof.pojo._01_creational_patterns.p02_factory_method.ex02_after;

public class BowHunterFactory implements HunterFactory{

    @Override
    public Hunter createHunter(String name) {
        return new BowMan(name);
    }
}
