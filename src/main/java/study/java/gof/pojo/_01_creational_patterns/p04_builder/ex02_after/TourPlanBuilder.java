package study.java.gof.pojo._01_creational_patterns.p04_builder.ex02_after;

import study.java.gof.pojo._01_creational_patterns.p04_builder.ex01_before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {
    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();
}
