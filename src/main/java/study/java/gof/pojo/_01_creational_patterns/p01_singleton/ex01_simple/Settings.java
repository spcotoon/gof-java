package study.java.gof.pojo._01_creational_patterns.p01_singleton.ex01_simple;

public class Settings {

    private static Settings instace;

    private Settings() {
    }

    /**
     * 단일 쓰레드에선 하나의 인스턴스만 생성해서 사용하지만
     * 멀티 쓰레드 환경에선 각각의 쓰레드가 new Settings(); 하기 때문에 쓰레드-세이프 하지 않다.
     */
    public static Settings getInstance() {
        if (instace == null) {
            instace = new Settings();
        }
        return instace;
    }


    /**
     * synchronized 키워드로 여러 쓰레드가 있어도
     * 이 메서드엔 한번에 하나의 쓰레드만 접근할 수 있어 하나의 인스턴스만 보장할 수 있으나
     * 동기화 처리 작업 때문에 성능저하 가능성
     */
    public static synchronized Settings getInstanceThreadSafe() {
        if (instace == null) {
            instace = new Settings();
        }
        return instace;
    }
}
