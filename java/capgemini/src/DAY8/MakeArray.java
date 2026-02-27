package DAY8;

public class MakeArray {
    static void main() {
        int[][] arr = new int[3][4];
        int count = 0;
        for(int i = 0 ; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                count++;
                arr[i][j] = count;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
