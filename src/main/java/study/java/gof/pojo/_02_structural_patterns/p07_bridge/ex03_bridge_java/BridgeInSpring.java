package study.java.gof.pojo._02_structural_patterns.p07_bridge.ex03_bridge_java;

import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

public class BridgeInSpring {
    public static void main(String[] args) {
        PlatformTransactionManager platformTransactionManager = new JdbcTransactionManager();
    }
}
