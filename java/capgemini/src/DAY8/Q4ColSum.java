package DAY8;

public class Q4ColSum {
    static void main() {
        int Colsum = 0;
        int [][] matrix = {{1,2,3,4},{5,6,7,8}};
//        int len = matrix.length;;
        for(int col = 0;col< matrix[0].length;col++){
            for(int row = 0; row<matrix.length;row++){

                Colsum += matrix[row][col];
            }
            System.out.println("the sum of row "+ (col+1) + " is " +  Colsum);
            Colsum = 0;
        }
    }
}
