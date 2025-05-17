package study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex02_after;


import lombok.RequiredArgsConstructor;
import study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before.DefaultHunterFactory;
import study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before.Hunter;
import study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before.SwordMan;

@RequiredArgsConstructor
public class SwordHunterFactory extends DefaultHunterFactory {

    private final SwordManEquipmentsFactory swordManEquipmentsFactory;

    @Override
    public Hunter createHunter(String name) {
        Hunter swordMan = new SwordMan(name);
        swordMan.setSword(swordManEquipmentsFactory.equipSword());
        swordMan.setShield(swordManEquipmentsFactory.equipShield());

        return swordMan;
    }
}
