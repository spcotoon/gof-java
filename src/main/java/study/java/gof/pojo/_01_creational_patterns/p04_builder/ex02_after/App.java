package study.java.gof.pojo._01_creational_patterns.p04_builder.ex02_after;

import study.java.gof.pojo._01_creational_patterns.p04_builder.ex01_before.TourPlan;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();

        //이 내용이 자주 쓰이는거라면
        //디렉터(TourDirector)를 만들어서 쉽게 재사용도 가능 27째 줄 참고
        TourPlan plan = builder
                .title("몽골")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2025, 7, 15))
                .whereToStay("리조트")
                .addPlan(0, "체크인")
                .addPlan(0, "저녁 식사")
                .getPlan();

        TourPlan shortTripPlan = builder
                .title("제주")
                .startDate(LocalDate.of(2025,7,15))
                .getPlan();

        //디렉터 활용
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.mongolTrip();
        TourPlan tourPlan1 = director.jejuTrip();
    }
}
