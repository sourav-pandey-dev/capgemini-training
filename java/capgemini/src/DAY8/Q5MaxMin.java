package DAY8;

public class Q5MaxMin {
    static void main() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int [][] matrix = {{1,2,3,4},{5,6,7,8}};
        for(int row = 0; row<matrix.length;row++){
            for(int col = 0;col< matrix[row].length;col++){
               min = (matrix[row][col]<min)? matrix[row][col]: min;
               max = (matrix[row][col]>max)? matrix[row][col]: max;
            }

        }
        System.out.println("the min element is  " + min);
        System.out.println("the max element is  " + max);

    }
}
