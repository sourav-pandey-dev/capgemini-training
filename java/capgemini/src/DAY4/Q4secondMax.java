package DAY4;

import java.util.Arrays;

public class Q4secondMax {
    static void main() {
        int[] arr = {9,8,5,9,1,8,6,4,6};
        int max = secondMax(arr);
        System.out.println(max);
    }

    private static int secondMax(int[] arr) {
        Arrays.sort(arr);
        int max = arr[0];
        int secMax = Integer.MIN_VALUE;
        for(int num : arr){
            if(num>max){
                secMax = max;
                max =num;
            }
        }
        return secMax;
    }
}
