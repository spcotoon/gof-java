package study.java.gof.pojo._01_creational_patterns.p02_factory_method.ex01_before;

public class HunterFactory {

    public static Hunter advanceJob(String name, String job) {
        //validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("이름을 입력하세요");
        }
        if (job == null || job.isBlank()) {
            throw new IllegalArgumentException("직업을 입력하세요");
        }

        prepareAdvance(name);

        Hunter hunter = new Hunter();
        hunter.setName(name);

        if (job.equalsIgnoreCase("sword")) {
            hunter.setJob("sword man");
            String swordLogo = "\uD83D\uDD2A";
            hunter.setLogo(swordLogo);
        } else if (job.equalsIgnoreCase("bow")) {
            hunter.setJob("bow man");
            String bowLogo = "\uD83C\uDFF9";
            hunter.setLogo(bowLogo);
        }

        notifyAdvance(hunter);

        return hunter;
    }

    private static void notifyAdvance(Hunter hunter) {
        System.out.println(hunter.getJob() + "으로 전직 하였습니다.");
    }

    private static void prepareAdvance(String name) {
        System.out.println(name + "님 전직하기");
    }
}
