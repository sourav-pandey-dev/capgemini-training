package day10;

import java.util.Scanner;

public class Q7removeFirstLast {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        String result = remover(str);
        System.out.println(result);
    }

    private static String remover(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt( str.length()-1);
        sb.deleteCharAt(0);
        return sb.toString();
    }
}
