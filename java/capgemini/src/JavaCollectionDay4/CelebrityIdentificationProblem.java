package JavaCollectionDay4;

import java.util.Stack;

public class CelebrityIdentificationProblem {

    public static void main(String[] args) {

        int[][] matrix = {
                {0,1,1,1},
                {0,0,1,0},
                {0,0,0,0},
                {1,1,1,0}
        };

        int celebrity = findCelebrity(matrix);

        if (celebrity == -1) {
            System.out.println("no celebrity present");
        } else {
            System.out.println("The celebrity is person : " + celebrity);
        }
    }

    private static int findCelebrity(int[][] matrix) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < matrix.length; i++) {
            st.push(i);
        }

        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            if (matrix[a][b] == 1) {
                st.push(b);
            } else {
                st.push(a);
            }
        }

        int candidate = st.pop();

        for (int i = 0; i < matrix.length; i++) {
            if (i == candidate) continue;

            if (matrix[candidate][i] == 1 || matrix[i][candidate] == 0) {
                return -1;
            }
        }

        return candidate;
    }
}
