package DAY9;

import java.util.Scanner;

public class Q1PalindromeFinder {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String Str = sc.nextLine();
//        boolean result = PalindromeWithMethod(Str);
//        System.out.println(result);

        boolean pdrome = pdromeWithoutMethod(Str);
        System.out.println(pdrome);
    }

    private static boolean pdromeWithoutMethod(String str) {
        for(int i = 0;i<str.length();i++){
            if (str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        }
        return true;
    }

    private static boolean PalindromeWithMethod(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
