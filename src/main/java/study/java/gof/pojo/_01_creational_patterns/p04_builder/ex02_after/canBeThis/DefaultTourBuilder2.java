package study.java.gof.pojo._01_creational_patterns.p04_builder.ex02_after.canBeThis;

import study.java.gof.pojo._01_creational_patterns.p04_builder.ex01_before.TourPlan;

import java.time.LocalDate;

public class DefaultTourBuilder2 implements TourPlanBuilder2 {

    private TourPlan tourPlan;

    public TourPlanBuilder2 newInstance() {
        this.tourPlan = new TourPlan();
        return this;
    }

    @Override
    public TourPlanBuilder2 nightsAndDays(int nights, int days) {
        this.tourPlan.setNights(nights);
        this.tourPlan.setDays(days);
        return this;
    }

    @Override
    public TourPlanBuilder2 title(String title) {
        this.tourPlan.setTitle(title);
        return this;
    }

    //...
    @Override
    public TourPlanBuilder2 startDate(LocalDate localDate) {
        return null;
    }

    @Override
    public TourPlanBuilder2 whereToStay(String whereToStay) {
        return null;
    }

    @Override
    public TourPlanBuilder2 addPlan(int day, String plan) {
        return null;
    }
    // ... //

    @Override
    public TourPlan getPlan() {
        return tourPlan;
    }
}
