package study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex03_abstract_factory_spring;

import org.springframework.beans.factory.FactoryBean;
import study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before.Hunter;
import study.java.gof.pojo._01_creational_patterns.p03_abstract_factory.ex01_before.SwordMan;

public class ExamFactory implements FactoryBean<Hunter> {
    @Override
    public Hunter getObject() throws Exception {
        return new SwordMan("ryu");
    }

    @Override
    public Class<?> getObjectType() {
        return Hunter.class;
    }
}
