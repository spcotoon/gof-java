package study.java.gof.pojo._01_creational_patterns.p04_builder.ex01_before;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        /**
         * 장황하고 일관된 프로세스가 없다
         */

        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("몽골");
        shortTrip.setStartDate(LocalDate.of(2025, 7, 15));
        /**
         * 예를들어
         * 1박이 설정되면 2일이 강제로 따라오게 하고싶은데 강제도 못함.
         * 객체가 불완전하게 만들어 질 수가 있음.
         */
        shortTrip.setNights(1);
        shortTrip.setDays(2);

        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");
        tourPlan.setPlans(new ArrayList<>());
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 부페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
        tourPlan.addPlan(1, "리조트 수영장에서 놀기");
        tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크");
        tourPlan.addPlan(2, "조식 부페에서 식사");
        tourPlan.addPlan(2, "체크아웃");
    }
}
