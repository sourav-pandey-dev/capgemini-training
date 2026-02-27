package javaCollectionDay1;

import java.util.Stack;
import java.util.Scanner;

public class ReversePolishNotation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        System.out.print("Enter postfix expression (space separated): ");
        String exp = sc.nextLine();

        String[] tokens = exp.split("\\s+");

        for (String token : tokens) {

            if (!isOperator(token)) {
                stack.push(token);
            }
            else {

                String b = stack.pop();
                String a = stack.pop();

                String combined = "(" + a + " " + token + " " + b + ")";

                stack.push(combined);
            }
        }

        System.out.println("Infix Expression: " + stack.pop());
        sc.close();
    }

    static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}