package onboarding;

import java.util.*;

public class SherlockAnagramsDebug {

    public static int sherlockAndAnagrams(String s) {

        int n = s.length();
        Map<String, Integer> map = new HashMap<>();
        int result = 0;

        System.out.println("Processing string: " + s);

        for (int start = 0; start < n; start++) {

            int[] freq = new int[26];

            for (int end = start; end < n; end++) {

                freq[s.charAt(end) - 'a']++;

                StringBuilder key = new StringBuilder();
                for (int i = 0; i < 26; i++) {
                    key.append(freq[i]).append('#');
                }

                String signature = key.toString();

                int count = map.getOrDefault(signature, 0);
                result += count;

                map.put(signature, count + 1);

                // Debug print
                System.out.println("Substring: " + s.substring(start, end + 1)
                        + " | Signature: " + signature
                        + " | Existing Count: " + count
                        + " | Current Result: " + result);
            }
        }

        System.out.println("Final Result for \"" + s + "\" = " + result);
        System.out.println("------------------------------------");

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < t; i++) {
            System.out.println("Enter string:");
            String s = sc.nextLine();
            sherlockAndAnagrams(s);
        }

        sc.close();
    }
}
