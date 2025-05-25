package study.java.gof.pojo._02_structural_patterns.p07_bridge.ex03_bridge_java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Slf4jExample {

    private static Logger logger = LoggerFactory.getLogger(Slf4jExample.class);

    public static void main(String[] args) {
        logger.info("hello logger");
    }
}
