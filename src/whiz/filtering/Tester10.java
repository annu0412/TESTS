package whiz.filtering;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Stream<Integer> ints = list.stream().map(s -> {
                    System.out.print(s);
                    return Integer.parseInt(s);
                }
        );
        System.out.print("Count : ");
        System.out.print(ints.count());

    }
}
