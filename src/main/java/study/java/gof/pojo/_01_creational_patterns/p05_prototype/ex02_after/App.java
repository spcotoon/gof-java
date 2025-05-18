package study.java.gof.pojo._01_creational_patterns.p05_prototype.ex02_after;

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
        GithubIssue clone = githubIssue.clone();
        System.out.println(clone.getUrl());
        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue)); //깊은 복사 구현 후 원본 바꿧으니 지금은 false 나옴. 원본 그대로면 내용은 같으니 true 나옴.
        System.out.println(clone.getClass() == githubIssue.getClass());
        //clone != githubIssue >> ref는 복제본이니 다르고
        //clone.equals(githubIssue) = ture >> 내용은 같으니 true 가 나와야 함, 단, equals 명시적 구현 해야함.

        //추가로.. 자바 기본 제공 clone()은 얕은 복사
        //얕은복사 > 같은 원본을 참조, 껍데기만 복사, 새 객체 생성이 아닌 새 참조자 생성
        //깊은복사 > 새 객체 만들어서 내용 복사
        //예시
        Person a = new Person();
        Person b = a; //얕은 복사

        Person c = new Person();
        Person d = new Person();
        d.name = c.name; //깊은 복사

        //GithubIssue에 깊은 복사 구현 후..

        //원본이 Deep 으로 바뀌었다고 클론도 바뀌지 않고 그대로 spcotoon으로 나옴.
        repository.setUser("Deep");
        System.out.println(clone.getUrl());
    }
    static class Person {
        String name;
    }
}
