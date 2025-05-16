package study.java.gof.pojo.singleton.ex04_simple_safe;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Settings settings = Settings.INSTANCE;

        //enum은 리플렉션 못하게 막혀있음.
        /*
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings1 = constructor.newInstance();
        */

        //enum 은 Serializable 구현하고 있어 직렬화 역직렬화에도 안전
        /*
        Settings settings1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings) in.readObject();
        }
         */

        Settings settings1 = Settings.INSTANCE;

        System.out.println(settings==settings1);
    }
}
