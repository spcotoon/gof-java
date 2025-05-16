package study.java.gof.pojo.singleton.ex03_attack_ex01_ex02;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        Settings2 settings2 = Settings2.getInstance();

        //리플렉션 활용해서 앞선 싱글톤 깨뜨리기
        Constructor<Settings2> constructor = Settings2.class.getDeclaredConstructor();
        constructor.setAccessible(true); //private에도 접근 가능하게 세팅
        Settings2 settings12 = constructor.newInstance();
        System.out.println(settings2 == settings12); //false

        //직렬화 & 역직렬화
        Settings2 settings3 = Settings2.getInstance();
        Settings2 settings4 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings3.obj"))) {
            out.writeObject(settings3);
        }

        //직렬화 역직렬화 거치면서 새로운 객체 생성
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings3.obj"))){
            settings4 = (Settings2) in.readObject();
        }

        System.out.println(settings3 == settings4); //false

    }
}
