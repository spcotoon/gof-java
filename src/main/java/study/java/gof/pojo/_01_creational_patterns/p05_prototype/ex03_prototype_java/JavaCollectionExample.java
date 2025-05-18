package study.java.gof.pojo._01_creational_patterns.p05_prototype.ex03_prototype_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {
    public static void main(String[] args) {
        Student ryu = new Student("ryu");
        Student spcotoon = new Student("spcotoon");
        List<Student> students = new ArrayList<>();
        students.add(ryu);
        students.add(spcotoon);

        //프로토타입 패턴은 아니지만 컬렉션 복사시 이렇게 많이 함.
        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
