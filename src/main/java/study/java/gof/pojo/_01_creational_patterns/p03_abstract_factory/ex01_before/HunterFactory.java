package study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before;


public interface HunterFactory {
    default Hunter advanceJob(String name, String job) {
        validate(name, job);
        prepareAdvance(name);
        Hunter hunter = createHunter(name);
        notifyAdvance(hunter);
        return hunter;
    }

    Hunter createHunter(String name);

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

    void notifyAdvance(Hunter hunter);
}
