package study.java.gof.pojo._01_creational_patterns.p05_prototype.ex01_before;

public class App {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("spcotoon");
        repository.setName("ryu");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("프로토타입 패턴이란");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue githubIssue2 = new GithubIssue(repository);
        githubIssue2.setId(2);
        githubIssue2.setTitle("이렇게 새로 만드는게 아니고, 기존 인스턴스를 복제해서(clone()) 쓰고싶다");
        System.out.println(githubIssue2.getUrl());

        //GithubIssue clone = githubIssue.clone();
        //clone != githubIssue >> ref는 복제본이니 다르고
        //clone.equals(githubIssue) = ture >> 내용은 같으니 true 가 나와야 함
    }
}
