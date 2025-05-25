package study.java.gof.pojo._02_structural_patterns.p07_bridge.ex03_bridge_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
    public static void main(String[] args) throws ClassNotFoundException{

        Class.forName ("org.h2.Driver");

        /**
         * 추상화된 인터페이스
         * Connection, DriverManager 등이
         * 새로운 디비가 만들어진다 해서 저 클래스의 내부 코드들을 바꾸지 않고 확장할 수 있다.
         */

        try (Connection conn = DriverManager.getConnection ("jdbc:h2:mem:~/test", "sa","")) {

            String sql =  "CREATE TABLE  ACCOUNT " +
                    "(id INTEGER not NULL, " +
                    " email VARCHAR(255), " +
                    " password VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";

            Statement statement = conn.createStatement();
            statement.execute(sql);

//            PreparedStatement statement1 = conn.prepareStatement(sql);
//            ResultSet resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
