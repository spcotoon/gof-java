package study.java.gof.pojo._01_creational_patterns.p04_builder.ex02_after.canBeThis;

import study.java.gof.pojo._01_creational_patterns.p04_builder.ex01_before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder2 {
    TourPlanBuilder2 newInstance();

    TourPlanBuilder2 nightsAndDays(int nights, int days);

    TourPlanBuilder2 title(String title);

    TourPlanBuilder2 startDate(LocalDate localDate);

    TourPlanBuilder2 whereToStay(String whereToStay);

    TourPlanBuilder2 addPlan(int day, String plan);

    TourPlan getPlan();
}
