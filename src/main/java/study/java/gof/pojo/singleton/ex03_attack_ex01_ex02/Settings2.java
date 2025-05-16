package study.java.gof.pojo.singleton.ex03_attack_ex01_ex02;

public class Settings2 {

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
}
