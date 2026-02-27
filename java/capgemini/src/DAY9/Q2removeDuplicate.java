package DAY9;

import java.util.HashSet;
import java.util.Scanner;

public class Q2removeDuplicate {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String Str = sc.nextLine();
        System.out.println("the string you entered it "+Str);
        String rem = DuplicateRemover(Str);
        System.out.println(rem);
    }

    private static String DuplicateRemover(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet();
        for(char c : str.toCharArray()){
                if(set.contains(c)) continue;
                set.add(c);
                sb.append(c);
        }
        return sb.toString();
    }
}
