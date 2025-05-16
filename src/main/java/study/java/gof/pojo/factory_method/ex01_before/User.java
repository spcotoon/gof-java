package study.java.gof.pojo.factory_method.ex01_before;

public class User {
    public static void main(String[] args) {
        Hunter swordHunter = HunterFactory.advanceJob("Ryu", "sword");
        System.out.println(swordHunter);

        Hunter bowHunter = HunterFactory.advanceJob("Arrow", "bow");
        System.out.println(bowHunter);
    }
}
