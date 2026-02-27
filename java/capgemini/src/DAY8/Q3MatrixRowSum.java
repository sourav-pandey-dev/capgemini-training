package DAY8;

public class Q3MatrixRowSum {
    static void main() {
        int Rowsum = 0;
        int [][] matrix = {{1,2,3,4},{5,6,7,8}};
        for(int row = 0; row<matrix.length;row++){
            for(int col = 0;col< matrix[row].length;col++){
                Rowsum += matrix[row][col];
            }
        System.out.println("the sum of row "+ (row+1) + " is " +  Rowsum);
            Rowsum = 0;
        }
    }
}
