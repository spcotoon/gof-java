package study.java.gof.pojo._01_creational_patterns.p02_factory_method.ex02_after;

public class User {
    public static void main(String[] args) {
        Hunter swordHunter = new SwordHunterFactory().createHunter("K");
        System.out.println(swordHunter);

        Hunter archer = new BowHunterFactory().createHunter("archer");
        System.out.println(archer);
    }
}
