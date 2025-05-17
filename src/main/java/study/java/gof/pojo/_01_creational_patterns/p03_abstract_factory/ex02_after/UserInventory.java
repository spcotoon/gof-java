package study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex02_after;

import study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before.Hunter;
import study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before.HunterFactory;

public class UserInventory {
    public static void main(String[] args) {
        HunterFactory swordManFactory = new SwordHunterFactory(new SteelEquipmentsFactory());
        Hunter swordMan = swordManFactory.createHunter("ryu");
        System.out.println(swordMan.getSword().getClass());
        System.out.println(swordMan.getShield().getClass());
    }
}
