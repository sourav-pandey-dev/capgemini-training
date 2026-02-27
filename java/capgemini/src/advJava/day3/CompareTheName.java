package advJava.day3;

import java.util.ArrayList;
import java.util.List;

public class CompareTheName {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("sourav");
        list.add("shubham");
        list.add("shubhi");
        list.add("ritwik");
        list.add("navneet");
        list.add("shivam");
        list.add("unnati");
        list.add("aditi");

        list.sort((a,b)-> a.compareTo(b));
        System.out.println(list);
    }

}
