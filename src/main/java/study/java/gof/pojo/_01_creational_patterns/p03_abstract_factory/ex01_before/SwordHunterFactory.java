package study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before;


public class SwordHunterFactory extends DefaultHunterFactory{
    @Override
    public Hunter createHunter(String name) {
        Hunter swordMan = new SwordMan(name);

        /**
         * 다른 장비를 착용하려면 아래 코드에 new를 바꿔서 해야함
         */
        swordMan.setSword(new TreeSword());
        swordMan.setShield(new TreeShield());
        return swordMan;
    }
}
