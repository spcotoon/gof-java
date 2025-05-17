package study.java.gof.pojo._01_creational_patterns.p02_factory_method.ex02_after;

public class SwordMan extends Hunter{
    public SwordMan(String name
    ) {
        setName(name);
        setJob("sword man");
        setLogo("\uD83D\uDD2A");
    }

    public SwordMan(){}
}
