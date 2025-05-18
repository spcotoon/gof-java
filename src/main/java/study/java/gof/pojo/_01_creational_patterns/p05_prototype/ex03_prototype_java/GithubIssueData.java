package study.java.gof.pojo._01_creational_patterns.p05_prototype.ex03_prototype_java;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GithubIssueData {
    private int id;
    private String title;
    private String repositoryUser;
    private String repositoryName;
}
