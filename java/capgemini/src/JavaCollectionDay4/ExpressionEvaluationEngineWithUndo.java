package JavaCollectionDay4;

import java.util.Scanner;
import java.util.Stack;

public class ExpressionEvaluationEngineWithUndo {
    static Stack<Integer> container = new Stack<>();

    public static void main(String[] args) {
        String choice = "";
        Scanner sc = new Scanner(System.in);

        while (!choice.equalsIgnoreCase("x")) {
            System.out.println("\n--- Expression Engine ---");
            System.out.println("Current History Size: " + container.size());
            System.out.println("1. Undo (View/Remove last result)");
            System.out.println("x. Exit");
            System.out.print("Enter postfix expression (e.g., '5 3 +'): ");

            choice = sc.nextLine();

            switch (choice.toLowerCase()) {
                case "1":
                    undo();
                    break;
                case "x":
                    System.out.println("Shutting down...");
                    break;
                default:
                    evaluatePostfix(choice);
            }
        }

    }

    private static void undo() {
        if (container.isEmpty()) {
            System.out.println("Nothing to undo!");
        } else {
            System.out.println("Removed last result: " + container.pop());
        }
    }

    private static void evaluatePostfix(String str) {
        Stack<Integer> st = new Stack<>();
        String[] tokens = str.split("\\s+");

        try {
            for (String token : tokens) {
                if (!isOperator(token)) {
                    st.push(Integer.parseInt(token));
                } else {
                    int b = st.pop();
                    int a = st.pop();
                    int result = 0;

                    switch (token) {
                        case "+": result = a + b; break;
                        case "-": result = a - b; break;
                        case "*": result = a * b; break;
                        case "/": result = a / b; break;
                    }
                    st.push(result);
                }
            }

            int finalResult = st.pop();
            System.out.println("Evaluation Result: " + finalResult);

            container.push(finalResult);

        } catch (Exception e) {
            System.out.println("Error: Invalid Expression Format.");
        }
    }

    static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}