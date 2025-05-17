package study.java.gof.pojo._01_creational_patterns.p02_factory_method.ex02_after;

public class UserAfter {
    public static void main(String[] args) {
        UserAfter user = new UserAfter();
        user.print(new SwordHunterFactory(), "ryu");
        user.print(new BowHunterFactory(), "archer");
    }

    private void print(HunterFactory hunterFactory, String name) {
        System.out.println(hunterFactory.createHunter(name));
    }
}
