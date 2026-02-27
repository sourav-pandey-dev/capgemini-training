package JavaCollectionDay4;

import java.util.Stack;

public class DecodeNestedEncodedString {

    public static void main(String[] args) {
        String str = "3[a2[b]]";
        System.out.println(decode(str));
    }

    public static String decode(String str) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char ch : str.toCharArray()) {

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(k);
                stringStack.push(current);
                current = new StringBuilder();
                k = 0;
            }
            else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder prev = stringStack.pop();
                for (int i = 0; i < repeat; i++) {
                    prev.append(current);
                }
                current = prev;
            }
            else {
                current.append(ch);
            }
        }

        return current.toString();
    }
}
