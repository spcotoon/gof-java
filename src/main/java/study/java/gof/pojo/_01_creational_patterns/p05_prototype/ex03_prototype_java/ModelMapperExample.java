package study.java.gof.pojo._01_creational_patterns.p05_prototype.ex03_prototype_java;

import org.modelmapper.ModelMapper;
import study.java.gof.pojo._01_creational_patterns.p05_prototype.ex02_after.GithubIssue;
import study.java.gof.pojo._01_creational_patterns.p05_prototype.ex02_after.GithubRepository;

public class ModelMapperExample {
    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("spcotoon");
        repository.setName("ryu");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("프로토타입 활용 예시: 다른 종류 객체에 내용을 옮겨 담고 싶다.");

        // ModelMapper 라는 라이브러리로 쉽게 쓸 수 있음.
        // implementation group: 'org.modelmapper', name: 'modelmapper', version: '2.3.9'
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println(githubIssueData);

    }
}
