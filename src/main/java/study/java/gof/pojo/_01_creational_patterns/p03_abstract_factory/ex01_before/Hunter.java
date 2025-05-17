package study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Hunter {
    private String name;
    private String job;
    private String logo;

    private Sword sword;
    private Shield shield;
}
