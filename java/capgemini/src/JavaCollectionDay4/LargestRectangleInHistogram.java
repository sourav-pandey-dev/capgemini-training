package JavaCollectionDay4;

import java.util.Stack;

public class LargestRectangleInHistogram {
    static void main() {
        int[] arr = {6,2,5,4,5,1,6};
        int[] pse = PseIndex(arr);
        int[] nse = NseIndex(arr);
        int maxArea = 0;
        for (int i=0;i< arr.length;i++){
            int area = arr[i] *(nse[i]-pse[i]-1);
            maxArea = Math.max(maxArea,area);
        }
        System.out.println(maxArea);
    }

    private static int[] NseIndex(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nse[i] = arr.length;
            } else {
                nse[i] = st.peek();
            }

            st.push(i);
        }
        return nse;
    }


    private static int[] PseIndex(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] pse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                pse[i] = -1;
            } else {
                pse[i] = st.peek();
            }

            st.push(i);
        }
        return pse;
    }

}
