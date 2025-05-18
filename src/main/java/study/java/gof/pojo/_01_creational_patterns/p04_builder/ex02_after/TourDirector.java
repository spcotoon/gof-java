package study.java.gof.pojo._01_creational_patterns.p04_builder.ex02_after;

import study.java.gof.pojo._01_creational_patterns.p04_builder.ex01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {
    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan mongolTrip() {
        return tourPlanBuilder
                .title("몽골")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2025, 7, 15))
                .whereToStay("리조트")
                .addPlan(0, "체크인")
                .addPlan(0, "저녁 식사")
                .getPlan();
    }

    public TourPlan jejuTrip() {
        return tourPlanBuilder
                .title("제주")
                .startDate(LocalDate.of(2025,7,15))
                .getPlan();
    }

}
