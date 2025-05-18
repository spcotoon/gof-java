package study.java.gof.pojo._01_creational_patterns.p04_builder.ex02_after.canBeThis;

import study.java.gof.pojo._01_creational_patterns.p04_builder.ex01_before.TourPlan;

public class App {
    public static void main(String[] args) {
        TourPlanBuilder2 tourPlan = new DefaultTourBuilder2();
        TourPlan plan = tourPlan.newInstance().nightsAndDays(2, 3).getPlan();
        System.out.println(plan.toString());
    }
}
