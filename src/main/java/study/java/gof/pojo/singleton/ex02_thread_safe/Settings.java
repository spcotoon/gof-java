package study.java.gof.pojo.singleton.ex02_thread_safe;

public class Settings {

    /**
     * 이른 초기화 (eager initialization)
     * 미리 static final로 초기화 시켜놓기.
     * 단점은 쓰건 안쓰건 미리 해두는게 낭비가 될 수 있음.
     */

    /*
    private static final Settings INSTANCE = new Settings();

    public static Settings getInstance() {
        return INSTANCE;
    }
    */

    /**
     * double-checked locking
     * 효율적인 동기화 블럭 활용
     *
     * volatile 키워드를 같이 써야하는데
     * JMM -> JVM의 메인메모리와 작업메모리 모델.
     * 어떤 쓰레드든 작업 메모리의 값을 메인 메모리 값과 비교하고 복사해서 동기화
     *
     */
    private static volatile Settings instance;

    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }

    private Settings() {
    }



}
