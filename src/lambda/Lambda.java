package lambda;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        String[] arr = {"Hello", "MyWorld", "!"};
        Arrays.sort(arr, new MyCompare());
        for (String s: arr) {
            System.out.println(s);
        }
        Arrays.sort(arr, (s1, s2) -> Integer.compare(s2.length(), s1.length()));

        for (String s: arr) {
            System.out.println(s);
        }

        List<String> arrNew = Arrays.asList("A", "AB", "ABC");
        arrNew.forEach((t)->{
            System.out.println(t);
        });
        arrNew.forEach(System.out::println);

    }
}
