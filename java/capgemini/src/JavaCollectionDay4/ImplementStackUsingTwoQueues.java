package JavaCollectionDay4;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingTwoQueues {

    static class Stack {

        private Queue<Integer> primaryQueue;
        private Queue<Integer> helperQueue;

        Stack() {
            primaryQueue = new LinkedList<>();
            helperQueue = new LinkedList<>();
        }

        void push(int value) {

            helperQueue.add(value);

            while (!primaryQueue.isEmpty()) {
                helperQueue.add(primaryQueue.remove());
            }

            Queue<Integer> temp = primaryQueue;
            primaryQueue = helperQueue;
            helperQueue = temp;
        }

        int pop() {
            if (isEmpty()) {
                return -1;
            }
            return primaryQueue.remove();
        }

        int peek() {
            if (isEmpty()) {
                return -1;
            }
            return primaryQueue.peek();
        }

        boolean isEmpty() {
            return primaryQueue.isEmpty();
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
