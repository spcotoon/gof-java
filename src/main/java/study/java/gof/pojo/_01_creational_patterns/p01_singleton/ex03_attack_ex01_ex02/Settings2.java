package study.java.gof.pojo._01_creational_patterns.p01_singleton.ex03_attack_ex01_ex02;

import java.io.Serializable;

public class Settings2 implements Serializable {

    private Settings2() {

    }

    /**
     * static inner 클래스 사용하기
     * getInstance() 가 호출 될 때 new Setting2(); 되기 때문에 double-checked 보다 심플하고 쓰레드-세이프
     */

    private static class Settings2Holder {
        private static final Settings2 INSTANCE = new Settings2();
    }

    public static Settings2 getInstance() {
        return Settings2Holder.INSTANCE;
    }

    /**
     * 역직렬화 대응 방안
     * protected Object readResolve() 키워드 사용.
     * 원랜 이 키워드 안에서 new 하는데, getInstance 반환 해버리면 싱글톤 유지 가능.
     */

    /*
    protected Object readResolve() {
        return getInstance();
    }
     */
}
