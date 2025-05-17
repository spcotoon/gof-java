package study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex02_after;

import study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before.Shield;
import study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before.Sword;

public class TreeEquipmentsFactory implements SwordManEquipmentsFactory{
    @Override
    public Sword equipSword() {
        return new TreeSword();
    }

    @Override
    public Shield equipShield() {
        return new TreeShield();
    }
}
