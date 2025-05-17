package study.java.gof.pojo._01_creational_patterns.p02_factory_method.ex02_after;

public interface HunterFactory {
    default Hunter advanceJob(String name, String job) {
        validate(name, job);
        prepareAdvance(name);
        Hunter hunter = createHunter(name);
        notifyAdvance(hunter);
        return hunter;
    }

    Hunter createHunter(String name);

    /**
     * 인터페이스 안에 private 메소드는 자바9부터 가능
     * (default는 자바8에 추가됐음)
     * 자바8 이하는 abstract 클래스로 중간에 계층 하나 더 만들어서
     * 거기서 private 메소드 오버라이드하고 SwordHunterFactory 에선 중간 추상클래스 상속
     */
    private void validate(String name, String job) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("이름을 입력하세요");
        }
        if (job == null || job.isBlank()) {
            throw new IllegalArgumentException("직업을 입력하세요");
        }
    }

    private void prepareAdvance(String name) {
        System.out.println(name + "님 전직하기");
    }

    private void notifyAdvance(Hunter hunter) {
        System.out.println(hunter.getJob() + "으로 전직 하였습니다.");
    }
}
