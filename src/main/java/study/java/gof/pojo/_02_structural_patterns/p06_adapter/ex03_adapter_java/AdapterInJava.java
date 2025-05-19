package study.java.gof.pojo._02_structural_patterns.p06_adapter.ex03_adapter_java;

import java.io.*;
import java.util.*;

public class AdapterInJava {
    public static void main(String[] args) {

        //넘긴 것은 배열이나 List 를 반환 받음.
        List<String> list = Arrays.asList("a", "b", "c");

        //넘긴 것은 List이나 Enumeration 을 받음.
        Enumeration<String> enumeration = Collections.enumeration(list);

        //Collections에 enumeration 을 받으면 ArrayList 를 반환하는 어댑터도 있음.
        ArrayList<String> list1 = Collections.list(Collections.emptyEnumeration());

        //io
        try (
                InputStream is = new FileInputStream("input.txt");
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader reader = new BufferedReader(isr)) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
