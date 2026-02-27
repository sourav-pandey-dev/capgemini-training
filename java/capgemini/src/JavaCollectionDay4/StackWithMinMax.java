package JavaCollectionDay4;

import java.util.Scanner;

public class StackWithMinMax {
    static class Node {
        int d;
        Node n;
        Node(int d) { this.d = d; }
    }

    static int[] st = new int[101];
    static int top = -1;
    static Node h = null;
    static Node t = null;

    static void atB(int v) {
        Node nn = new Node(v);
        if (h == null) { h = nn; t = nn; }
        else { nn.n = h; h = nn; }
    }

    static void atE(int v) {
        Node nn = new Node(v);
        if (h == null) { h = nn; t = nn; }
        else { t.n = nn; t = nn; }
    }

    static void atP(int v) {
        Node nn = new Node(v);
        Node tmp = h;
        while (tmp.n != null && tmp.n.d < v) tmp = tmp.n;
        nn.n = tmp.n;
        tmp.n = nn;
    }

    static void del(int v) {
        if (h == null) return;
        if (h.d == v) {
            if (h == t) { h = null; t = null; }
            else { h = h.n; }
            return;
        }
        Node tmp = h;
        while (tmp.n != null && tmp.n.d != v) tmp = tmp.n;
        if (tmp.n != null) {
            if (tmp.n == t) t = tmp;
            tmp.n = tmp.n.n;
        }
    }

    static void push(int v) {
        if (top >= 100) {
            System.out.println("!!! STACK OVERFLOW !!!");
            return;
        }
        top++;
        st[top] = v;
        if (h == null || v <= h.d) atB(v);
        else if (v >= t.d) atE(v);
        else atP(v);
        System.out.println("Success: Added " + v);
    }

    static void pop() {
        if (top == -1) {
            System.out.println("!!! STACK UNDERFLOW !!!");
            return;
        }
        int v = st[top];
        top--;
        del(v);
        System.out.println("Success: Removed " + v);
    }

    static void show() {
        if (top == -1) {
            System.out.println("Nothing to show!");
            return;
        }
        System.out.print("Stack (Top to Bottom): ");
        for (int i = top; i >= 0; i--) System.out.print(st[i] + " ");

        System.out.print("\nSorted List (Min to Max): ");
        Node tmp = h;
        while (tmp != null) {
            System.out.print(tmp.d + " ");
            tmp = tmp.n;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "";

        while (!choice.equalsIgnoreCase("x")) {
            System.out.println("\n--- STACK CONTROLLER ---");
            System.out.println("[1] PUSH  [2] POP  [3] MAX  [4] MIN  [5] DISPLAY  [X] EXIT");
            System.out.print("Enter command: ");
            choice = sc.nextLine();

            switch (choice.toLowerCase()) {
                case "1":
                    System.out.print("Value: ");
                    push(Integer.parseInt(sc.nextLine()));
                    break;
                case "2":
                    pop();
                    break;
                case "3":
                    System.out.println(t != null ? "--> Current Max: " + t.d : "List is empty!");
                    break;
                case "4":
                    System.out.println(h != null ? "--> Current Min: " + h.d : "List is empty!");
                    break;
                case "5":
                    show();
                    break;
                case "x":
                    System.out.println("Closing...");
                    break;
                default:
                    System.out.println("Invalid key!");
            }
        }
    }
}