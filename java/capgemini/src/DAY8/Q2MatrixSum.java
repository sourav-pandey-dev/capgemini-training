package DAY8;

public class Q2MatrixSum {
    static void main() {
        int sum = 0;
        int [][] matrix = {{1,2,3,4},{5,6,7,8}};
        for(int row = 0; row<matrix.length;row++){
            for(int col = 0;col< matrix[row].length;col++){
                sum += matrix[row][col];
            }
        }
        System.out.println(sum);
    }
}
