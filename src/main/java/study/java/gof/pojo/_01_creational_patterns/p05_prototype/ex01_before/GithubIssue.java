package study.java.gof.pojo._01_creational_patterns.p05_prototype.ex01_before;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GithubIssue {
    private int id;
    private String title;
    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public String getUrl() {
        return String.format("http://github.com/%s/%s/issue/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }
}
