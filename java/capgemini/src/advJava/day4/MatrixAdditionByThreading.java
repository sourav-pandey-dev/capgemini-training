package advJava.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixAdditionByThreading  {
    static void main() throws Exception {
        int [][] matrix1 = {
                {1,2,23,4,},
                {1,2,23,4,},
                {1,2,23,4,},
                {1,2,23,4,},
                {1,2,23,4,},
        };
        int [][] matrix2 = {
                {1,2,23,4,},
                {1,2,23,4,},
                {1,2,23,4,},
                {1,2,23,4,},
                {1,2,23,4,},
        };
        int[][] result =  new int[5][4];
        List<Thread> list = new ArrayList<>();
        for(int i = 0 ; i<5 ;i++){
            Adder add = new Adder(matrix1[i],matrix2[i],i,result);
            list.add(add);
            add.start();
        }
        for (Thread t : list) {

            t.join();
        }
        System.out.println(Arrays.deepToString(result));
    }
}
