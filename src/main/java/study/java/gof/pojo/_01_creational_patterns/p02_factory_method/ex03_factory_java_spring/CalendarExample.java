package study.java.gof.pojo._01_creational_patterns.p02_factory_method.ex03_factory_java_spring;

import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {
    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")));
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")));
    }
}

/**
 * Calendar 는 이런 느낌
 */
class SimpleFactory{
    public Object createProduct(String name) {
        if (name.equals("A")) {
            return new A();
        } else if (name.equals("B")) {
            return new B();
        }

        throw new IllegalArgumentException();
    }
}

class A{}
class B{}