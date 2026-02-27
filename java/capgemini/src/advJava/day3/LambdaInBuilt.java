package advJava.day3;

import java.util.List;
import java.util.function.Consumer;

public class LambdaInBuilt {
    static void main() {
        Consumer<String> consumer = (str) ->{
            System.out.println("this is a consumer");
            System.out.println("this is consuming "+ str);
        };
        consumer.accept("SPRING FRAMEWORK");

        List<Integer> list = List.of(4,5,7,78,6,5,7);
        list.forEach((x)-> System.out.println("consuming " +x));
        System.out.println(30);
        list.forEach(System.err::println);
    }
}
