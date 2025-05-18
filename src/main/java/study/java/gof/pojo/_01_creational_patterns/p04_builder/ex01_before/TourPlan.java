package study.java.gof.pojo._01_creational_patterns.p04_builder.ex01_before;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class TourPlan {

    private String title;
    private int nights;
    private int days;
    private LocalDate startDate;
    private String whereToStay;
    private List<DetailPlan> plans;

    public void addPlan(int day, String plan) {
        this.plans.add(new DetailPlan(day,plan));
    }
}
