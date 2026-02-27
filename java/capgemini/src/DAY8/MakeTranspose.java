package DAY8;

public class MakeTranspose {
    static void main() {
        int [][] arr = {{1,2,3},{4,5,6}};
        int row =arr.length;
        int col = arr[0].length;
        int [][] transpose = new int [col][row];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                transpose[j][i] = arr[i][j];
            }
        }
        for(int i = 0 ; i<transpose.length;i++){
            for(int j = 0; j<transpose[i].length;j++){

                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
//        int [][] result =  AddMatrix(arr,transpose);
        for(int i = 0 ; i<transpose.length;i++){
            for(int j = 0; j<transpose[i].length;j++){

                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }

}
