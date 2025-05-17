package study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex02_after;

import study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before.Shield;
import study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before.Sword;

public interface SwordManEquipmentsFactory {
    Sword equipSword();

    Shield equipShield();

}
