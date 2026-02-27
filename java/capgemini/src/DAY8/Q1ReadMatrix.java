package DAY8;

import java.util.Scanner;

public class Q1ReadMatrix {
    static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter row : ");
            int row = sc.nextInt();
            System.out.println("Enter Column : ");
            int col = sc.nextInt();
            System.out.println();
            String arr[][] = new String[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.next();
                }
            }
            System.out.println("Entered Matrix  : ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

