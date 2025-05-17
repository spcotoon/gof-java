package study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before;

public abstract class DefaultHunterFactory implements HunterFactory {
    @Override
    public void notifyAdvance(Hunter hunter) {
        System.out.println(hunter.getJob() + "으로 전직 하였습니다.");
    }
}
