package study.java.gof.pojo._01_creational_patterns.p05_prototype.ex02_after;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class GithubIssue implements Cloneable{
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

    //clone() 사용 위해 Cloneable 구현..
    @Override
    public GithubIssue clone() {
        //자바 기본 제공은 얕은 복사이므로
        //깊은 복사를 원하면 직접 구현해야함.
        GithubRepository repository = new GithubRepository();
        repository.setUser(this.repository.getUser());
        repository.setName(this.repository.getName());

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(this.id);
        githubIssue.setTitle(this.title);

//            return (GithubIssue) super.clone();
        return githubIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, repository);
    }
}
